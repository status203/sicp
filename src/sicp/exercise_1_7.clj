;; Square root by Newton's method using different good enough algos
(ns sicp.exercise-1-7)

(defn average [& xs]
  (/ (reduce + xs) (count xs)))

(defn improve [guess x]
  (average guess (/ x guess)))

(defn good-enough-abs? [guess x]
  (< (Math/abs (- (* guess guess) x)) 0.001))

(defn sqrt-abs [x]
  (loop [guess 1.0 x x]
    (if (good-enough-abs? guess x)
      guess
      (recur (improve guess x)
             x))))

(defn good-enough-rel? [guess prev-guess]
  (< (/ (Math/abs (- guess prev-guess)) guess) 0.001))

(defn sqrt-rel [x]
  (loop [x x guess 1.0 prev-guess 0.0]
    (if (good-enough-rel? guess prev-guess)
      guess
      (recur x
             (improve guess x)
             guess))))