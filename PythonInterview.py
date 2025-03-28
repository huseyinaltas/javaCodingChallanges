def rearrange_digits(phrase):
   even = 0
   odd = -1
   result = ''
   phrase = str(phrase)

   for n in range(len(phrase)):
     if n%2 == 0:
        result = result + phrase[even]
        even += 1
     else:
       result = result + phrase[odd]
       odd += -1
   return result
  
  # Example usage
# print(rearrange_digits(123456))  # Output: 162534
# print(rearrange_digits(123))     # Output: 132
# print(rearrange_digits(1234))    # Output: 1423
# print(rearrange_digits(123456789101112))    # Output: 1423


def longestDiverseString( a: int, b: int, c: int) -> str:
        sb = []
        
        total_length = a + b + c
        continuous_a = 0
        continuous_b = 0
        continuous_c = 0
        
        for _ in range(total_length):
            # print(a,b,c)
            # print(continuous_a,continuous_b,continuous_c)
            # print(sb)
            # print("#######\n")
            if (a >= b and a >= c and continuous_a != 2) or (continuous_b == 2 and a > 0) or (continuous_c == 2 and a > 0):
                sb.append("a")
                a -= 1
                continuous_a += 1
                continuous_b = 0
                continuous_c = 0
            elif (b >= a and b >= c and continuous_b != 2) or (continuous_a == 2 and b > 0) or (continuous_c == 2 and b > 0):
                sb.append("b")
                b -= 1
                continuous_b += 1
                continuous_a = 0
                continuous_c = 0
            elif (c >= a and c >= b and continuous_c != 2) or (continuous_b == 2 and c > 0) or (continuous_a == 2 and c > 0):
                sb.append("c")
                c -= 1
                continuous_c += 1
                continuous_a = 0
                continuous_b = 0
        
        return ''.join(sb)

   # Example usage
print(longestDiverseString(7,2,0))     # Output: aabaabaa
print(longestDiverseString(1,1,7))     # Output: ccaccbcc
print(longestDiverseString(5,5,5))     # Output: aabbccaabbccabc


def maxApple(A, K, L):
    """
    Finds the maximum sum of apples Alice and Bob can collect.

    Args:
        A: A list of integers representing the number of apples at each position.
        K: The length of Alice's segment.
        L: The length of Bob's segment.

    Returns:
        The maximum sum of apples Alice and Bob can collect, or -1 if it's impossible.
    """
    if K + L > len(A):
        return -1

    max_apples = -1
    for i in range(len(A) - K + 1):
        for j in range(len(A) - L + 1):
            if i + K <= j or j + L <= i:  # Ensure no overlap
                alice_apples = sum(A[i:i + K])
                bob_apples = sum(A[j:j + L])
                total_apples = alice_apples + bob_apples
                max_apples = max(max_apples, total_apples)

    return max_apples
    
# print(maxApple([6, 1, 4, 6, 3, 2, 7, 4, 9], 2, 3))  # 30 (10, 20)
# print(maxApple([6, 1, 4, 6, 3, 2, 7, 4], 2, 2))  # 21 (6+4, 7+4)
# print(maxApple([6, 1, 4, 6, 3, 2, 7, 4], 3, 2))  # 24 (4+6+3, 7+4)
# print(maxApple([6, 1, 4, 6, 3, 2, 7, 4], 2, 3))  # 24 (4+6+3, 7+4)
# print(maxApple([1, 2, 3, 4, 5], 2, 1))  # 12 (4+5, 3)
# print(maxApple([1, 2, 3, 4, 5], 1, 2))  # 9 (3, 4+5)
# print(maxApple([1, 2, 3, 4, 5], 3, 2))  # 15 (1+2+3, 4+5)
# print(maxApple([1, 2, 3, 4, 5], 2, 3))  # 15 (1+2, 3+4+5)
# print(maxApple([1, 2, 3, 4, 5], 4, 1))  # 15 (2+3+4+5, 1)
# print(maxApple([1, 2, 3, 4, 5], 1, 4))  # 15 (1, 2+3+4+5)
# print(maxApple([1, 2, 3, 4, 5], 5, 1))  # -1
# print(maxApple([1, 2, 3, 4, 5], 1, 5))  # -1
# print(maxApple([1, 2, 3, 4, 5], 6, 1))  # -1
# print(maxApple([1, 2, 3, 4, 5], 1, 6))  # -1
# print(maxApple([5, 4, 3, 2, 1], 2, 2)) #14 (5+4,3+2)
# print(maxApple([10,5,1,8,2,9],3,2)) #34 (8+2+9, 10+5)
# print(maxApple([1,1,1,1,1,1,1,1,1,1],5,5)) #10
# print(maxApple([1,1,1,1,1,1,1,1,1,1],1,9)) #10
# print(maxApple([1,1,1,1,1,1,1,1,1,1],9,1)) #10
# print(maxApple([],1,1)) # -1
# print(maxApple([1],1,1)) # -1
# print(maxApple([1,2],1,1)) # 3
# print(maxApple([1,2,3],1,1)) # 5
# print(maxApple([5,5,5,5,5,5],3,3)) #30

    
   