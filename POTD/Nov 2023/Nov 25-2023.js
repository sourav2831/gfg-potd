//Shuffle integers

class Solution {
  shuffleArray(arr, n) {
    var s1 = 0;
    var s2 = n / 2;
    var MOD = 1024;
    for (var i = 0; i < n; i++) {
      let x = 0;
      if (i % 2 == 0) {
        x = arr[s1++] % MOD;
      } else {
        x = arr[s2++] % MOD;
      }
      arr[i] = arr[i] + x * MOD;
    }
    for (var i = 0; i < n; i++) {
      arr[i] = Math.floor(arr[i] / MOD);
    }
  }
}
