#this is in python solution that I have done for better understanding

def is_permutation(s: str, t:str)->bool:
    #1. optimisation: if the strings have different lengths it is impossible to be a permutation 

    if len(s) != len(t):
        return False
    
    #2. sort both strings. if they are permutation, 

#their sorted version will be identical and it says they are permutation

    return sorted(s)==sorted(t)

# Test cases 
if __name__ == "__main__": 
    test_pairs = [
        ("apple", "papel"),   # True
        ("carrot", "tarroc"), # True
        ("hello", "llloh"),   # False
        ("dog", "God"),       # False (case-sensitive)
        (" a bc ", "bca  ") 


    ]

    for s1, s2 in test_pairs:
        result = is_permutation(s1,s2)
        print(f'"{s1}","{s2}" : {result}')