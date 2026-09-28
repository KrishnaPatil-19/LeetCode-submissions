class Solution:
    def isPalindrome(self, s: str) -> bool:
        def clean_str(s):
            return ''.join([char for char in s if char.isalnum()])

        text = clean_str(s).lower()

        if text[::-1] == text:
            return True
        else:
            return False