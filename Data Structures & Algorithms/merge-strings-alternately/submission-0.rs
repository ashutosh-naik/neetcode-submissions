impl Solution {
    pub fn merge_alternately(word1: String, word2: String) -> String {
        let b1 = word1.as_bytes();
        let b2 = word2.as_bytes();

        let mut ans = String::with_capacity(b1.len() + b2.len());
        
        let mut i = 0;
        while i < b1.len() && i < b2.len() {
            ans.push(b1[i] as char);
            ans.push(b2[i] as char);
            i += 1;
        }

        while i < b1.len() {
            ans.push(b1[i] as char);
            i += 1;
        }

        while i < b2.len() {
            ans.push(b2[i] as char);
            i += 1;
        }

        ans
    }
}