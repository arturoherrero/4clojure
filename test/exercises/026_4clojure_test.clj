(ns exercises.026-4clojure-test
  (:require [clojure.test :refer :all]))

(defn fibonacci [number]
  (->> [1 1]
    (iterate (fn [[a b]] [b (+ a b)]))
    (map first)
    (take number)))

(deftest exercise-test
  (testing
    (is (= (fibonacci 3) '(1 1 2)))
    (is (= (fibonacci 6) '(1 1 2 3 5 8)))
    (is (= (fibonacci 8) '(1 1 2 3 5 8 13 21)))))

;; https://www.4clojure.com/problem/26
;; Write a function which returns the first X fibonacci numbers.
