(ns sicp.exercise-1-3)

;; More generic than was asked for.
(defn sum-largest-2
  "takes a number (>= 2) of arguments and returns the sum of the two largest"
  [& xs] (apply + (take-last 2 (sort xs))))

(sum-largest-2 4 5) ; 9
(sum-largest-2 3 4 5) ; 9
(sum-largest-2 5 4 3) ; 9
(sum-largest-2 1 2 3 4 5 6 5 4 3 2 1) ; 11

;; Make it more generic
(defn sum-largest-n
  "returns the sum of the largest n arguments"
  [n & xs] (apply + (take-last n (sort xs))))

(def test-args [1 2 3 4 5 6 7 6 5 4 3 2 1])
(apply sum-largest-n 2 test-args)
(apply sum-largest-n 3 test-args)
(apply sum-largest-n 4 test-args)
