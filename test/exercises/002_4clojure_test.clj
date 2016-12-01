(ns exercises.002-4clojure-test
  (:require [clojure.test :refer :all]))

(deftest exercise-test
  (testing
    (is (= (- 10 (* 2 3)) 4))))

;; https://www.4clojure.com/problem/2
;; If you are not familiar with polish notation, simple arithmetic
;; might seem confusing. https://en.wikipedia.org/wiki/Polish_notation
