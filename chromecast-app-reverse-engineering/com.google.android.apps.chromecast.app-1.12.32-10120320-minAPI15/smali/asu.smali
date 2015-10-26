.class public final Lasu;
.super Lj;
.source "PG"


# static fields
.field private static final b:Ljava/lang/String;

.field private static c:Ldcj;


# instance fields
.field private a:Laqw;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 35
    const/4 v0, 0x0

    sput-object v0, Lasu;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Lj;-><init>()V

    return-void
.end method

.method public static a(Ldcj;)Lasu;
    .locals 4

    .prologue
    .line 39
    new-instance v0, Lasu;

    invoke-direct {v0}, Lasu;-><init>()V

    .line 40
    sput-object p0, Lasu;->c:Ldcj;

    .line 41
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 42
    const-string v2, "peoplePickerSettingDescription"

    iget-object v3, p0, Ldcj;->d:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    const/4 v2, 0x0

    invoke-virtual {p0}, Ldcj;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    invoke-virtual {v0, v1}, Lasu;->f(Landroid/os/Bundle;)V

    .line 45
    return-object v0
.end method

.method static synthetic a(Lasu;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 29
    .line 2110
    const-string v0, "<(.+?)>"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    .line 2111
    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 2112
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method static synthetic b(Lasu;Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 29
    .line 2116
    sget-object v0, Landroid/util/Patterns;->EMAIL_ADDRESS:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    .line 29
    return v0
.end method

.method static synthetic p()Ldcj;
    .locals 1

    .prologue
    .line 29
    sget-object v0, Lasu;->c:Ldcj;

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    .prologue
    .line 63
    sget v0, La;->fy:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    .line 64
    iget-object v0, p0, Lasu;->a:Laqw;

    sget v1, Lb;->cI:I

    invoke-virtual {p0, v1}, Lasu;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Laqw;->c(Ljava/lang/String;)V

    .line 66
    sget v0, Lf;->bb:I

    .line 67
    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/apps/chromecast/app/backdrop/PeoplePickerRecipientView;

    .line 68
    new-instance v1, Landroid/widget/MultiAutoCompleteTextView$CommaTokenizer;

    invoke-direct {v1}, Landroid/widget/MultiAutoCompleteTextView$CommaTokenizer;-><init>()V

    invoke-virtual {v0, v1}, Lcom/google/android/apps/chromecast/app/backdrop/PeoplePickerRecipientView;->setTokenizer(Landroid/widget/MultiAutoCompleteTextView$Tokenizer;)V

    .line 69
    new-instance v1, Laav;

    .line 1612
    iget-object v3, p0, Lj;->y:Lm;

    .line 69
    invoke-direct {v1, v3}, Laav;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lcom/google/android/apps/chromecast/app/backdrop/PeoplePickerRecipientView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 71
    sget v1, Lf;->bG:I

    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    .line 72
    new-instance v3, Lasv;

    invoke-direct {v3, p0, v0}, Lasv;-><init>(Lasu;Lcom/google/android/apps/chromecast/app/backdrop/PeoplePickerRecipientView;)V

    invoke-virtual {v1, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 102
    return-object v2
.end method

.method public final a()V
    .locals 1

    .prologue
    .line 56
    invoke-super {p0}, Lj;->a()V

    .line 57
    const/4 v0, 0x0

    iput-object v0, p0, Lasu;->a:Laqw;

    .line 58
    return-void
.end method

.method public final a(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 50
    invoke-super {p0, p1}, Lj;->a(Landroid/app/Activity;)V

    .line 51
    check-cast p1, Laqw;

    iput-object p1, p0, Lasu;->a:Laqw;

    .line 52
    return-void
.end method
