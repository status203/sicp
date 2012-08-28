(ns sicp.section-1-1-4)

;; Let's go straight to (defn... rather than (def square [x] (...
;; (but not sure that adding a doc string would be in the right
;; spirit at the moment
(defn square [x] (* x x))

(square 21)

(square (+ 2 5))

(square (square 3))


(def x 3)
(def y 4)
(+ (square x) (square y))

(defn sum-of-squares [x y]
  (+ (square x) (square y)))

(sum-of-squares 3 4)


(defn f [a]
  (sum-of-squares (+ a 1) (* a 2)))

(f 5)
