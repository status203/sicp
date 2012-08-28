(ns sicp.section-1-1-5
  (:use [sicp.section-1-1-4 :only (f)]))

;; Use to explore (the suburbs of) namespaces as there is otherwise
;; little to do for this section but it does refer to functions
;; defined in a previous section.

(f 5)

(sicp.section-1-1-4/sum-of-squares (+ 5 1) (* 5 2))