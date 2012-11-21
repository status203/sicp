(ns sicp.test.exercise-1-3
  (:use clojure.test)
  (:use midje.sweet)
  (:use sicp.exercise-1-3))

;; sum-of-squares-largest-2
(fact (sum-of-squares-largest-2 4 5) => 41)
(fact (sum-of-squares-largest-2 3 4 5) => 41)
(fact (sum-of-squares-largest-2 5 4 3) => 41)
(fact (sum-of-squares-largest-2 1 2 3 4 5 6 5 4 3 2 1) => 61)

;; sum-of-squares-largest-n
(def test-args [1 2 3 4 5 6 7 6 5 4 3 2 1])
(fact (apply sum-of-squares-largest-n 2 test-args) => 85)
(fact (apply sum-of-squares-largest-n 3 test-args) => 121)
(fact (apply sum-of-squares-largest-n 4 test-args) => 146)

;; sum-of-squares-largest-2-low-tech
(fact (sum-of-squares-largest-2-low-tech 3 4 5) => 41)
(fact (sum-of-squares-largest-2-low-tech 3 5 4) => 41)
(fact (sum-of-squares-largest-2-low-tech 4 3 5) => 41)
(fact (sum-of-squares-largest-2-low-tech 4 5 3) => 41)
(fact (sum-of-squares-largest-2-low-tech 5 3 4) => 41)
(fact (sum-of-squares-largest-2-low-tech 5 4 3) => 41)

