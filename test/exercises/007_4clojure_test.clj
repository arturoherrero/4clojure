(ns exercises.007-4clojure-test
  (:require [clojure.test :refer :all]))

(deftest exercise-test
  (testing
    (is (= [1 2 3 4] (conj [1 2 3] 4)))
    (is (= [1 2 3 4] (conj [1 2] 3 4)))))

;; https://www.4clojure.com/problem/7
;; When operating on a Vector, the conj function will return a new vector with
;; one or more items "added" to the end.
