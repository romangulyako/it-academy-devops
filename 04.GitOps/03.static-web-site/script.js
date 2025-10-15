document.getElementById('timestamp').textContent = new Date().toLocaleString();

function showAlert() {
    alert('🎉 Hello! The site is working perfectly!');
}

document.addEventListener('DOMContentLoaded', function() {
    const cards = document.querySelectorAll('.feature-card');
    
    cards.forEach(card => {
        card.addEventListener('click', function() {
            this.style.backgroundColor = '#f0f8ff';
            setTimeout(() => {
                this.style.backgroundColor = 'white';
            }, 300);
        });
    });
});