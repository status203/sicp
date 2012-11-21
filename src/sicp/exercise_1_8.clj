(ns sicp.exercise-1-8)

(defn improve [x guess]
  (/(+ (/ x (* guess guess)) (* 2 guess)) 3))

(defn good-enough? [x guess]
  (< (Math/abs (- (* guess guess guess) x)) 0.001))

(defn cubert [x]
  (loop [x x guess 1.0]
    (if (good-enough? x guess)
      guess
      (recur x
             (improve x guess)))))
