class Solution:
    # def hammingWeight(self, n: int) -> int:
    #     return bin(n).count('1')
    # manual
    def hammingWeight(self, n: int) -> int:
        count = 0
        while n:
            if n & 1:  # verifica se o último bit é 1
                count += 1
            n >>= 1  # desloca os bits para a direita (divide por 2)
        return count

# Create an instance of the Solution class
sol = Solution()

# Call the method on the instance
print(sol.hammingWeight(11))         # Output: 3
print(sol.hammingWeight(128))        # Output: 1
print(sol.hammingWeight(2147483645)) # Output: 30



    
