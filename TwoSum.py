from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        num_map = {}

        for i, num in enumerate(nums):
            complement = target - num
            print()
            print(f'Numero(key) {num}, complement {complement}, indice(valor) {i}, e dict {num_map}')
            if complement in num_map:              
                
                print(f'achou o complmento {complement} dentro do dict {num_map}')
                print(f' A lista com os indices dos numeros que somados somam o target {target} eh: {num_map[complement], i}')
                
                return [num_map[complement], i] # aqui vai retornar uma lista!
                
                # return [nums[num_map[complement]], nums[i]] retorna os numeros 
            num_map[num] = i # adding a chave (num) e o valor associado (i) {key(num):value(i)}

            print(f'added to dict o key(num){num}, e valor(i){i}, updated dict {num_map}') 
            print(f'Nao achou o complemento {complement}, dentro do dict {num_map}')
            print()
            
        return []        

solution = Solution()
print(solution.twoSum([2, 7, 11, 15, 17], 26)) 
