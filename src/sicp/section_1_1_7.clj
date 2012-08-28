;; Square root by Newton's method
(ns sicp.section-1-1-7)

(defn average [& xs]
  (/ (reduce + xs) (count xs)))

(defn improve [guess x]
  (average guess (/ x guess)))

(defn good-enough? [guess x]
  (< (Math/abs (- (* guess guess) x)) 0.001))

(defn sqrt [x]
  (loop [guess 1.0 x x]
    (if (good-enough? guess x)
      guess
      (recur (improve guess x)
             x))))

(map sqrt (range 17))