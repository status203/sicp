(ns sicp.exercise-1-3
  (:use sicp.section-1-1-4))

;; More generic than was asked for.
(defn sum-of-squares-largest-2
  "takes a number (>= 2) of arguments and returns the sum of the two largest"
  [& xs] (apply (comp + sum-of-squares) (take-last 2 (sort xs))))

;; Make it more generic
(defn sum-of-squares-largest-n
  "returns the sum of the largest n arguments"
  [n & xs]  (reduce + (map square (take-last n (sort xs)))))

;; Exactly as asked for, only using features covered so far
(defn sum-of-squares-largest-2-low-tech
  "Takes three args and returns the sum of the squares of the largest 2"
  [a b c] (cond (and (< a b) (< a c)) (sum-of-squares b c)
                (< b c) (sum-of-squares a c)
                :else (sum-of-squares a b)))

