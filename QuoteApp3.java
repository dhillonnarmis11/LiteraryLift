import java.awt.BorderLayout; // Importing the BorderLayout class from the java.awt package for arranging components in a container
import java.awt.Color; // Importing the Color class from the java.awt package for specifying colors
import java.awt.Font;  // Importing the Font class from the java.awt package for setting fonts
import java.awt.event.ActionEvent;  // Importing the ActionEvent class from the java.awt.event package for handling button clicks
import java.awt.event.ActionListener;  // Importing the ActionListener interface from the java.awt.event package for listening to action events
import javax.swing.*;  // Importing the Swing library for creating the GUI components

// LiteraryLift Quote App Final Java code File for Comp 155 Final Project - Simran Dhillon 300211810 

public class QuoteApp3 {

    // Arrays for holding the different categories of my app's quotes;
    // decided to use arrays since easier to edit since I can add more quotes if i wish to in future!


    private static final String[] motivationalQuotes = {
        "“To understand the immeasurable, the mind must be extraordinarily quiet, still.”\n" + //
                "― J. Krishnamurti",
        "“To live is the rarest thing in the world. Most people exist, that is all.”\n" + //
                "― Oscar Wilde",
        "“There are only two ways to live your life. One is as though nothing is a miracle. The other is as though everything is a miracle.”\n" + //
                "― Albert Einstein",
        "“It’s only after you’ve stepped outside your comfort zone that you begin to change, grow, and transform.”\n" + //
                "― Roy T. Bennett",
        "“Believe you can and you're halfway there.”\n" + //
                "― Theodore Roosevelt",
        "“You are never too old to set another goal or to dream a new dream.”\n" + //
                "― C.S. Lewis",
        "“The only way to do great work is to love what you do.”\n" + //
                "― Steve Jobs",
        "“Challenges are what make life interesting and overcoming them is what makes life meaningful.”\n" + //
                "― Joshua J. Marine",
        "“The future belongs to those who believe in the beauty of their dreams.”\n" + //
                "― Eleanor Roosevelt",
        "“Do not dwell in the past, do not dream of the future, concentrate the mind on the present moment.”\n" + //
                "― Buddha",
        "“The only limit to our realization of tomorrow will be our doubts of today.”\n" + //
                "― Franklin D. Roosevelt",
        "“It always seems impossible until it's done.”\n" + //
                "― Nelson Mandela",
        "“The best way to find yourself is to lose yourself in the service of others.”\n" + //
                "― Mahatma Gandhi",
        "“In the middle of difficulty lies opportunity.”\n" + //
                "― Albert Einstein",
        "“The purpose of our lives is to be happy.”\n" + //
                "― Dalai Lama",
        "“Your time is limited, don't waste it living someone else's life.”\n" + //
                "― Steve Jobs",
        "“The only way to achieve the impossible is to believe it is possible.”\n" + //
                "― Charles Kingsleigh, Alice in Wonderland"
    };
    

    private static final String[] philosophicalQuotes = {
        "“Sometimes the questions are complicated and the answers are simple.”\n" + //
                "― Dr. Seuss",
        "“But better to get hurt by the truth than comforted with a lie.”\n" + //
                "― Khaled Hosseini",
        "“The flower that blooms in adversity is the rarest and most beautiful of all.”\n" + //
                "― Walt Disney Company, Mulan",
        "“I was never really insane except upon occasions when my heart was touched.”\n" + //
                "― Edgar Allan Poe",
        "“There is only one good, knowledge, and one evil, ignorance.”\n" + //
                "― Socrates",
        "“The only true wisdom is in knowing you know nothing.”\n" + //
                "― Socrates",
        "“The unexamined life is not worth living.”\n" + //
                "― Socrates",
        "“Happiness depends upon ourselves.”\n" + //
                "― Aristotle",
        "“Man is the measure of all things.”\n" + //
                "― Protagoras",
        "“Life must be lived as play.”\n" + //
                "― Plato",
        "“You talk when you cease to be at peace with your thoughts.”\n" + //
                "― Kahlil Gibran, The Prophet",
        "“May you live every day of your life.”\n" + //
                "― Jonathan Swift",
        "“There is nothing either good or bad, but thinking makes it so.”\n" + //
                "― William Shakespeare, Hamlet",
        "“The most beautiful experience we can have is the mysterious. It is the fundamental emotion that stands at the cradle of true art and true science.”\n" + //
                "― Albert Einstein, The World As I See It",
        "“Think left and think right and think low and think high. Oh, the thinks you can think up if only you try!”\n" + //
                "― Dr. Seuss",
        "“Those who know do not speak. Those who speak do not know.”\n" + //
                "― Lao Tsu, Tao Teh Ching",
        "“Science is not only compatible with spirituality; it is a profound source of spirituality.”\n" + //
                "― Carl Sagan",
        "“Well, I must endure the presence of a few caterpillars if I wish to become acquainted with the butterflies.”\n" + //
                "― Antoine de Saint-Exupéry, The Little Prince",
        "“It is not true that people stop pursuing dreams because they grow old, they grow old because they stop pursuing dreams.”\n" + //
                "― Gabriel García Márquez"
    };
    

    private static final String[] spiritualQuotes = {
        "“Be realistic: Plan for a miracle.”\n" + //
                "― Osho",
        "“You may have many problems in your life, but your lips must not know about them. They must always wear a smile.”\n" + //
                "― Sri Sri Ravi Shankar",
        "“Let no man in the world live in delusion. Without a Guru none can cross over to the other shore.”\n" + //
                "― Guru Nanak",
        "“You have the right to work, but never to the fruit of work.”\n" + //
                "― Bhagavad Gita",
        "“The Lord is my shepherd; I shall not want.”\n" + //
                "― Bible, Psalms 23:1",
        "“I am the Atman, the inner Self, who is present in the hearts of all creatures. I am the beginning, the middle, and the end of all beings.”\n" + //
                "― Upanishads",
        "“A simple smile. That’s the start of opening your heart and being compassionate to others.”\n" + //
                "― Dalai Lama",
        "“In true love, there is no heartbreak. True love is unconditional and unconditional love is the greatest gift.”\n" + //
                "― Sri Sri Ravi Shankar",
        "“The whole secret of existence is to have no fear. Never fear what will become of you, depend on no one. Only the moment you reject all help are you freed.”\n" + //
                "― Buddha",
        "“You are not a drop in the ocean. You are the entire ocean in a drop.”\n" + //
                "― Rumi",
        "“The heart is the only book worth reading.”\n" + //
                "― Rumi",
        "“Do not be satisfied with the stories that come before you. Unfold your own myth.”\n" + //
                "― Rumi",
        "“The breeze at dawn has secrets to tell you. Don't go back to sleep.”\n" + //
                "― Rumi",
        "“Stop acting so small. You are the universe in ecstatic motion.”\n" + //
                "― Rumi",
        "“Wherever you are, and whatever you do, be in love.”\n" + //
                "― Rumi",
        "“When you do things from your soul, you feel a river moving in you, a joy.”\n" + //
                "― Rumi",
        "“The wound is the place where the Light enters you.”\n" + //
                "― Rumi",
        "“Don't grieve. Anything you lose comes round in another form.”\n" + //
                "― Rumi",
        "“Seek the wisdom that will untie your knot. Seek the path that demands your whole being.”\n" + //
                "― Rumi",
        "“The quieter you become, the more you are able to hear.”\n" + //
                "― Rumi",
        "“Let yourself be silently drawn by the strange pull of what you really love. It will not lead you astray.”\n" + //
                "― Rumi",
        "“Where there is no love, there is no devotion; where there is no devotion, there is no yearning for the Lord's name.”\n" + //
                "― Saint Kabir",
        "“The river that flows in you also flows in me.”\n" + //
                "― Saint Kabir",
        "“The music of the saints shall resound, and the truth shall bloom.”\n" + //
                "― Saint Kabir",
        "“Praise the Lord, the embodiment of light and sound, by meditating on the true Guru.”\n" + //
                "― Saint Kabir",
        "“Do not go to the garden of flowers! O friend! Go not there; In your body is the garden of flowers. Take your seat on the thousand petals of the lotus, and there gaze on the Infinite Beauty.”\n" + //
                "― Saint Kabir",
        "“By his command, bodies are created; his command cannot be described. By his command, souls come into being; by his command, glory and greatness are obtained.”\n" + //
                "― Guru Granth Sahib",
        "“In the realm of the fearless Lord, the musician plays the melody of love, and the unstruck sound current vibrates.”\n" + //
                "― Guru Granth Sahib",
        "“Those who have not the thread of the Naam, the Name of the Lord, in their hands — the living beings and the earth shall cry out against them on the day of reckoning.”\n" + //
                "― Guru Granth Sahib",
        "“Make compassion the cotton, contentment the thread, modesty the knot and truth the twist. This is the sacred thread of the soul; if you have it, then go ahead and put it on me.”\n" + //
                "― Guru Granth Sahib",
        "“Make the Holy Naam your friend, and wealth and Maya will not consume you.”\n" + //
                "― Guru Granth Sahib",
        "“For I know the plans I have for you, declares the Lord, plans for welfare and not for evil, to give you a future and a hope.”\n" + //
                "― Jeremiah 29:11",
        "“Trust in the Lord with all your heart, and do not lean on your own understanding. In all your ways acknowledge him, and he will make straight your paths.”\n" + //
                "― Proverbs 3:5-6",
        "“But they who wait for the Lord shall renew their strength; they shall mount up with wings like eagles; they shall run and not be weary; they shall walk and not faint.”\n" + //
                "― Isaiah 40:31",
        "“The Lord is my light and my salvation; whom shall I fear? The Lord is the stronghold of my life; of whom shall I be afraid?”\n" + //
                "― Psalms 27:1",
        "“Do not be anxious about anything, but in everything by prayer and supplication with thanksgiving let your requests be made known to God.”\n" + //
                "― Philippians 4:6",
        "“You have the right to work, but never to the fruit of work. You should never engage in action for the sake of reward, nor should you long for inaction.”\n" + //
                "― Bhagavad Gita 2:47",
        "“The soul can never be cut to pieces by any weapon, nor burned by fire, nor moistened by water, nor withered by the wind.”\n" + //
                "― Bhagavad Gita 2:23",
        "“Whatever happened, happened for the good; whatever is happening, is happening for the good; whatever will happen, will also happen for the good only. You need not have any regrets for the past. You need not worry for the future. The present is happening.”\n" + //
                "― Bhagavad Gita 2:47",
        "“One who sees inaction in action, and action in inaction, is intelligent among men, and he is in the transcendental position, although engaged in all sorts of activities.”\n" + //
                "― Bhagavad Gita 4:18",
        "“Perform your obligatory duty, because action is indeed better than inaction.”\n" + //
                "― Bhagavad Gita 3:8",
        "“Truth alone triumphs.”\n" + //
                "― Mundaka Upanishad",
        "“The wise who knows the Self as bodiless within the bodies, as unchanging among changing things, as great and omnipresent, does never grieve.”\n" + //
                "― Katha Upanishad",
        "“The Self is hidden in the hearts of all, as butter lies hidden in cream. Realize the Self in the depths of meditation— The Lord of Love, supreme Reality, who is the goal of all knowledge.”\n" + //
                "― Mundaka Upanishad"
    };
    


    private static final String[] lifeQuotes = {
        "“Life is what happens to us while we are making other plans.”\n" + //
                "― Allen Saunders",
        "“I may not have gone where I intended to go, but I think I have ended up where I needed to be.”\n" + //
                "― Douglas Adams, The Long Dark Tea-Time of the Soul",
        "“It does not do to dwell on dreams and forget to live.”\n" + //
                "― J.K. Rowling, Harry Potter and the Sorcerer's Stone",
        "“The purpose of our lives is to be happy.”\n" + //
                "― Dalai Lama",
        "“Life is like riding a bicycle. To keep your balance, you must keep moving.”\n" + //
                "― Albert Einstein",
        "“In three words I can sum up everything I've learned about life: it goes on.”\n" + //
                "― Robert Frost",
        "“Life is either a daring adventure or nothing at all.”\n" + //
                "― Helen Keller",
        "“In the end, it's not the years in your life that count. It's the life in your years.”\n" + //
                "― Abraham Lincoln",
        "“The biggest adventure you can take is to live the life of your dreams.”\n" + //
                "― Oprah Winfrey",
        "“Don't count the days, make the days count.”\n" + //
                "― Muhammad Ali",
        "“Life is what we make it, always has been, always will be.”\n" + //
                "― Grandma Moses",
        "“You can't go back and change the beginning, but you can start where you are and change the ending.”\n" + //
                "― C.S. Lewis",
        "“Life isn't about finding yourself. Life is about creating yourself.”\n" + //
                "― George Bernard Shaw",
        "“The purpose of life is not to be happy. It is to be useful, to be honorable, to be compassionate, to have it make some difference that you have lived and lived well.”\n" + //
                "― Ralph Waldo Emerson",
        "“Life is a journey that must be traveled no matter how bad the roads and accommodations.”\n" + //
                "― Oliver Goldsmith",
        "“Life is 10% what happens to us and 90% how we react to it.”\n" + //
                "― Charles R. Swindoll",
        "“Life is not a problem to be solved, but a reality to be experienced.”\n" + //
                "― Søren Kierkegaard",
        "“Life is a series of natural and spontaneous changes. Don't resist them; that only creates sorrow. Let reality be reality. Let things flow naturally forward in whatever way they like.”\n" + //
                "― Lao Tzu",
        "“The man who moves a mountain begins by carrying away small stones.”\n" + //
                "― Confucius",
        "“It does not matter how slowly you go as long as you do not stop.”\n" + //
                "― Confucius",
        "“Our greatest glory is not in never falling, but in rising every time we fall.”\n" + //
                "― Confucius",
        "“The journey of a thousand miles begins with one step.”\n" + //
                "― Lao Tzu",
        "“He who asks a question is a fool for five minutes; he who does not ask a question remains a fool forever.”\n" + //
                "― Confucius",
        "“The superior man is modest in his speech but exceeds in his actions.”\n" + //
                "― Confucius",
        "“When it is obvious that the goals cannot be reached, don't adjust the goals, adjust the action steps.”\n" + //
                "― Confucius",
        "“Silence is a true friend who never betrays.”\n" + //
                "― Confucius",
        "“The more you know, the less you need.”\n" + //
                "― Lao Tzu",
        "“Choose a job you love, and you will never have to work a day in your life.”\n" + //
                "― Confucius",
        "“Arise, awake, and stop not until the goal is achieved.”\n" + //
                "― Swami Vivekananda",
        "“The mind acts like an enemy for those who do not control it.”\n" + //
                "― Bhagavad Gita",
        "“The one who has conquered himself is a far greater hero than he who has defeated a thousand times a thousand men.”\n" + //
                "― Bhagavad Gita",
        "“From joy springs all creation, by joy it is sustained, towards joy it proceeds, and into joy it enters.”\n" + //
                "― Taittiriya Upanishad",
        "“You are what your deep, driving desire is. As your desire is, so is your will. As your will is, so is your deed. As your deed is, so is your destiny.”\n" + //
                "― Brihadaranyaka Upanishad"
    };
    


    private static final String[] literatureQuotes = {
        "“It is our choices, Harry, that show what we truly are, far more than our abilities.”\n" + //
                "― J.K. Rowling, Harry Potter and the Chamber of Secrets",
        "“So many books, so little time.”\n" + //
                "― Frank Zappa",
        "“To the well-organized mind, death is but the next great adventure.”\n" + //
                "― J.K. Rowling, Harry Potter and the Sorcerer's Stone",
        "“There are no facts, only interpretations.”\n" + //
                "― Friedrich Nietzsche",
        "“There is no friend as loyal as a book.”\n" + //
                "― Ernest Hemingway",
        "“Books are a uniquely portable magic.”\n" + //
                "― Stephen King",
        "“The more that you read, the more things you will know. The more that you learn, the more places you'll go.”\n" + //
                "― Dr. Seuss",
        "“It is better to be hated for what you are than to be loved for what you are not.”\n" + //
                "― André Gide",
        "“I have always imagined that Paradise will be a kind of library.”\n" + //
                "― Jorge Luis Borges",
        "“A room without books is like a body without a soul.”\n" + //
                "― Marcus Tullius Cicero",
        "“The person, be it gentleman or lady, who has not pleasure in a good novel, must be intolerably stupid.”\n" + //
                "― Jane Austen, Northanger Abbey",
        "“All animals are equal, but some animals are more equal than others.”\n" + //
                "― George Orwell, Animal Farm",
        "“To be yourself in a world that is constantly trying to make you something else is the greatest accomplishment.”\n" + //
                "― Ralph Waldo Emerson",
        "“And those who were seen dancing were thought to be insane by those who could not hear the music.”\n" + //
                "― Friedrich Nietzsche",
        "“We are all in the gutter, but some of us are looking at the stars.”\n" + //
                "― Oscar Wilde, Lady Windermere's Fan",
        "“Some cause happiness wherever they go; others whenever they go.”\n" + //
                "― Oscar Wilde, The Picture of Dorian Gray",
        "“Love looks not with the eyes, but with the mind, And therefore is winged Cupid painted blind.”\n" + //
                "― William Shakespeare, A Midsummer Night's Dream",
        "“All the world's a stage, and all the men and women merely players.”\n" + //
                "― William Shakespeare, As You Like It",
        "“To thine own self be true, and it must follow, as the night the day, thou canst not then be false to any man.”\n" + //
                "― William Shakespeare, Hamlet",
        "“In the midst of winter, I found there was, within me, an invincible summer.”\n" + //
                "― Albert Camus, The Stranger",
        "“The weak can never forgive. Forgiveness is the attribute of the strong.”\n" + //
                "― Mahatma Gandhi, An Autobiography: The Story of My Experiments with Truth",
        "“The mind is restless and difficult to restrain, but it is subdued by practice.”\n" + //
                "― The Bhagavad Gita",
        "“The journey of a thousand miles begins with a single step.”\n" + //
                "― Lao Tzu, Tao Te Ching",
        "“It is better to conquer yourself than to win a thousand battles. Then the victory is yours. It cannot be taken from you, not by angels or by demons, heaven or hell.”\n" + //
                "― Gautama Buddha",
        "“Do not dwell in the past, do not dream of the future, concentrate the mind on the present moment.”\n" + //
                "― Gautama Buddha",
        "“You can't change what's happened. The only thing you can control is how you deal with it.”\n" + //
                "― Salman Rushdie, Midnight's Children",
        "“Language is courage: the ability to conceive a thought, to speak it, and by doing so to make it true.”\n" + //
                "― Salman Rushdie, Midnight's Children",
        "“To understand just one life, you have to swallow the world.”\n" + //
                "― Salman Rushdie, Midnight's Children",
        "“There are dark shadows on the earth, but its lights are stronger in the contrast.”\n" + //
                "― Charles Dickens, The Pickwick Papers",
        "“Have a heart that never hardens, and a temper that never tires, and a touch that never hurts.”\n" + //
                "― Charles Dickens",
        "“Whatever our souls are made of, his and mine are the same.”\n" + //
                "― Emily Brontë, Wuthering Heights",
        "“He's more myself than I am. Whatever our souls are made of, his and mine are the same.”\n" + //
                "― Emily Brontë, Wuthering Heights",
        "“I am Heathcliff - he's always, always in my mind - not as a pleasure, any more than I am always a pleasure to myself - but, as my own being.”\n" + //
                "― Emily Brontë, Wuthering Heights",
        "“If all else perished, and he remained, I should still continue to be; and if all else remained, and he were annihilated, the universe would turn to a mighty stranger.”\n" + //
                "― Emily Brontë, Wuthering Heights",
        "“The mind is its own place, and in itself can make a heaven of hell, a hell of heaven.”\n" + //
                "― John Milton, Paradise Lost",
        "“You never really understand a person until you consider things from his point of view... Until you climb inside of his skin and walk around in it.”\n" + //
                "― Harper Lee, To Kill a Mockingbird",
        "“The one thing that doesn't abide by majority rule is a person's conscience.”\n" + //
                "― Harper Lee, To Kill a Mockingbird",
        "“People generally see what they look for, and hear what they listen for.”\n" + //
                "― Harper Lee, To Kill a Mockingbird",
        "“A wound can be an entry point for the truth.”\n" + //
                "― Michael Ondaatje, Anil's Ghost",
        "“There is nothing I would not do for those who are really my friends. I have no notion of loving people by halves, it is not my nature.”\n" + //
                "― Jane Austen, Northanger Abbey",
        "“I declare after all there is no enjoyment like reading! How much sooner one tires of any thing than of a book! -- When I have a house of my own, I shall be miserable if I have not an excellent library.”\n" + //
                "― Jane Austen, Pride and Prejudice",
        "“I am not afraid of storms, for I am learning how to sail my ship.”\n" + //
                "― Louisa May Alcott, Little Women"
    };
    
  

    public static void main(String[] args) {

        // Creating the main frame for app, which user will interact with

        JFrame frame = new JFrame("LiteraryLift"); // setting the title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // this is the default close operation
        frame.setSize(500, 250); // setting size of frame
        frame.getContentPane().setBackground(new Color(173, 216, 230)); // setting the background color of frame


        // creating a panel which holds GUI components

        JPanel panel = new JPanel();
        panel.setBackground(new Color(173, 216, 230)); // setting the background color of panel

        // creating a label to display the quotes

        JLabel quoteLabel = new JLabel(" Welcome to LiteraryLift! A daily dose of inspiration & meditation through quotes!"); // welcome message for user
        quoteLabel.setFont(new Font("Serif", Font.BOLD, 18)); // Setting font and size of label
        quoteLabel.setForeground(new Color(70, 70, 70)); // Setting text color

        // creating button for generating a random quote from one specific category; from spiritual category

        JButton generateButton = new JButton("Generate Random Quote (Click if feeling Meditative!)"); // this is where the label goes for button
        generateButton.setFont(new Font("SansSerif", Font.PLAIN, 14)); // Setting font and size
        generateButton.setBackground(new Color(0, 0, 139)); // setting the button color
        generateButton.setForeground(Color.BLUE); // Setting text color
        generateButton.setFocusPainted(false); // Remove the border when clicked, to make it look aesthetically pleasing

        // creating a button to select a quote by the categories available to choose from

        JButton categoryButton = new JButton("Select Quote by Category");
        categoryButton.setFont(new Font("SansSerif", Font.PLAIN, 16)); // Setting font and size
        categoryButton.setBackground(new Color(0, 128, 0)); // setting for button color
        categoryButton.setForeground(Color.BLUE); // Setting text color
        categoryButton.setFocusPainted(false); // Remove the border when clicked

        // adding action listeners (type of class) to the buttons

        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // generating a random quote from one category if user does not wish to pick a category
                // for random quote generator, only spiritual quotes will be shown as it is my personal favourite category! 
                int randomIndex = (int) (Math.random() * spiritualQuotes.length);
                String randomQuote = spiritualQuotes[randomIndex];
                
                //setting the generated quote as the text of label
                quoteLabel.setText("<html><div style='text-align: center;'>" + randomQuote + "</div></html>"); // Center-aligning text
            }
        });

        categoryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // displaying dialog to select a category for quotes available 
                String selectedCategory = (String) JOptionPane.showInputDialog(frame,
                        "Select a category:", "Category Selection", JOptionPane.QUESTION_MESSAGE, null,
                        categories, categories[0]);

                // retrieving a random quote from selected category 

                if (selectedCategory != null) {
                    String quote = getRandomQuoteByCategory(selectedCategory);
                    // setting selected quote as the text of the label
                    quoteLabel.setText("<html><div style='text-align: center;'>" + quote + "</div></html>");
                }
            }
        });

        // setting the layout of the panel and adding components to it 
        panel.setLayout(new BorderLayout()); // set layout manager of panel
        panel.add(quoteLabel, BorderLayout.CENTER); // adding quote label to center of panel
        panel.add(generateButton, BorderLayout.SOUTH); // adding generate button to bottom
        panel.add(categoryButton, BorderLayout.NORTH); // adding category button at top

        // adding the panel to frame and making frame visible 
        frame.add(panel);
        frame.setVisible(true);
    }

    // array holding the categories of quotes 
    private static final String[] categories = {"Motivational", "Philosophical", "Spiritual", "Life", "Literature"};

    // Method to get random quote from a selected category 
    private static String getRandomQuoteByCategory(String category) {
        String[] selectedCategoryQuotes;
        // selecting the array of quotes based on selected category 
        switch (category) {
            case "Motivational":
                selectedCategoryQuotes = motivationalQuotes;
                break;
            case "Philosophical":
                selectedCategoryQuotes = philosophicalQuotes;
                break;
            case "Spiritual":
                selectedCategoryQuotes = spiritualQuotes;
                break;
            case "Life":
                selectedCategoryQuotes = lifeQuotes;
                break;
            case "Literature":
                selectedCategoryQuotes = literatureQuotes;
                break;
            default:
                selectedCategoryQuotes = new String[0]; // No quotes for unknown category, set as default in case of error
        }

        // Selecting a random quote from the selected category list 
        if (selectedCategoryQuotes.length > 0) {
            int randomIndex = (int) (Math.random() * selectedCategoryQuotes.length);
            return selectedCategoryQuotes[randomIndex];
        } else {
            return "No quotes found for the selected category."; // return message in case no quotes found for particular category 
        }
    }
}
