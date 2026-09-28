class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        hash_map_s = {}
        for char in s:
            if char in hash_map_s:
                hash_map_s[char] += 1
            else:
                hash_map_s[char] = 1
        
        hash_map_t = {}
        for char in t :
            if char in hash_map_t:
                hash_map_t[char] += 1
            else:
                hash_map_t[char] = 1
        
        if hash_map_s == hash_map_t:
            return True
        else:
            return False 