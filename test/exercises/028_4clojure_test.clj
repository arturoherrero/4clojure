(ns exercises.028-4clojure-test
  (:require [clojure.test :refer :all]))

(defn my-flatten [collection]
  (reduce (fn [flattened element]
            (concat
              flattened
              (if (sequential? element) (my-flatten element) (list element))))
          '()
          collection))

(deftest exercise-test
  (testing
    (is (= (my-flatten '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6)))
    (is (= (my-flatten ["a" ["b"] "c"]) '("a" "b" "c")))
    (is (= (my-flatten '((((:a))))) '(:a)))))

;; https://www.4clojure.com/problem/28
;; Write a function which flattens a sequence.
