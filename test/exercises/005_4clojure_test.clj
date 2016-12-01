(ns exercises.005-4clojure-test
  (:require [clojure.test :refer :all]))

(deftest exercise-test
  (testing
    (is (= '(1 2 3 4) (conj '(2 3 4) 1)))
    (is (= '(1 2 3 4) (conj '(3 4) 2 1)))))

;; https://www.4clojure.com/problem/5
;; When operating on a list, the conj function will return a new list with one
;; or more items "added" to the front.
