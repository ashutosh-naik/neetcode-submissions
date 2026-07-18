class Solution {
    func canPlaceFlowers(_ flowerbed: [Int], _ n: Int) -> Bool {

        if n == 0 {
            return true
        }

        var flowerbed = flowerbed
        var count = 0
        var i = 0

        while i < flowerbed.count {

            if flowerbed[i] == 0 &&
                (i == 0 || flowerbed[i - 1] == 0) &&
                (i == flowerbed.count - 1 || flowerbed[i + 1] == 0) {

                flowerbed[i] = 1
                count += 1

                if count >= n {
                    return true
                }

                i += 2   // Skip the next plot
            } else {
                i += 1
            }
        }

        return false
    }
}