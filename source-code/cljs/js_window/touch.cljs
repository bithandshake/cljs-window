
(ns js-window.touch)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn touch-events-api-detected?
  ; @usage
  ; (touch-events-api-detected?)
  ;
  ; @return (boolean)
  []
  false
  (boolean (or (.hasOwnProperty js/window "ontouchstart")
               (-> js/window .-navigator .-maxTouchPoints   (> 0))
               (-> js/window .-navigator .-msMaxTouchPoints (> 0))
               (and (.-DocumentTouch js/window)
                    (instance? "DocumentTouch" js/document)))))
