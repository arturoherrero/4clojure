(ns exercises.014-4clojure-test
  (:require [clojure.test :refer :all]))

(deftest exercise-test
  (testing
    (is (= 8 ((fn add-five [x] (+ x 5)) 3)))
    (is (= 8 ((fn [x] (+ x 5)) 3)))
    (is (= 8 (#(+ % 5) 3)))
    (is (= 8 ((partial + 5) 3)))))

;; https://www.4clojure.com/problem/14
;; Clojure has many different ways to create functions.
