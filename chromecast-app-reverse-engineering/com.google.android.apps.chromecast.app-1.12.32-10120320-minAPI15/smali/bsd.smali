.class public final Lbsd;
.super Lbra;


# direct methods
.method constructor <init>(Lbrb;)V
    .locals 0

    invoke-direct {p0, p1}, Lbra;-><init>(Lbrb;)V

    return-void
.end method


# virtual methods
.method protected final a()V
    .locals 0

    return-void
.end method

.method public final b()Lcpg;
    .locals 3

    .prologue
    .line 0
    invoke-virtual {p0}, Lbsd;->r()V

    .line 1000
    iget-object v0, p0, Lbqz;->d:Lbrb;

    invoke-virtual {v0}, Lbrb;->b()Lcox;

    move-result-object v0

    .line 2000
    iget-object v0, v0, Lcox;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    new-instance v1, Lcpg;

    invoke-direct {v1}, Lcpg;-><init>()V

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-static {v2}, Lbqs;->a(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    .line 3000
    iput-object v2, v1, Lcpg;->a:Ljava/lang/String;

    .line 2000
    iget v2, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 4000
    iput v2, v1, Lcpg;->c:I

    .line 2000
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 5000
    iput v0, v1, Lcpg;->d:I

    .line 0
    return-object v1
.end method

.method public final c()Ljava/lang/String;
    .locals 3

    .prologue
    .line 0
    invoke-virtual {p0}, Lbsd;->r()V

    invoke-virtual {p0}, Lbsd;->b()Lcpg;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6000
    iget v2, v0, Lcpg;->c:I

    .line 0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 7000
    iget v0, v0, Lcpg;->d:I

    .line 0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
