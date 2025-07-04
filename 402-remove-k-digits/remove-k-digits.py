class Solution:
    def removeKdigits(self, num: str, k: int) -> str:
        stack = []
        for c in num:
            while k > 0 and stack and stack[-1] > c:
                k -= 1
                stack.pop()
            stack.append(c)

        # Remove remaining digits from the end if k > 0
        stack = stack[:len(stack) - k]

        # Join the result and remove leading zeros
        res = "".join(stack).lstrip("0")

        # If the result is empty, return "0"
        return res if res else "0"
