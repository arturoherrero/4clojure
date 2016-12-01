(ns exercises.017-4clojure-test
  (:require [clojure.test :refer :all]))

(deftest exercise-test
  (testing
    (is (= '(6 7 8) (map #(+ % 5) '(1 2 3))))))

;; https://www.4clojure.com/problem/17
;; The map function takes two arguments: a function (f) and a sequence
;; (s). Map returns a new sequence consisting of the result of applying f
;; to each item of s.
