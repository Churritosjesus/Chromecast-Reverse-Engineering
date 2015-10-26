.class public final Lhw;
.super Ler;
.source "PG"


# instance fields
.field private synthetic b:Landroid/support/v4/view/ViewPager;


# direct methods
.method public constructor <init>(Landroid/support/v4/view/ViewPager;)V
    .locals 0

    .prologue
    .line 2846
    iput-object p1, p0, Lhw;->b:Landroid/support/v4/view/ViewPager;

    invoke-direct {p0}, Ler;-><init>()V

    return-void
.end method

.method private a()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 2898
    iget-object v1, p0, Lhw;->b:Landroid/support/v4/view/ViewPager;

    invoke-static {v1}, Landroid/support/v4/view/ViewPager;->a(Landroid/support/v4/view/ViewPager;)Lgn;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lhw;->b:Landroid/support/v4/view/ViewPager;

    invoke-static {v1}, Landroid/support/v4/view/ViewPager;->a(Landroid/support/v4/view/ViewPager;)Lgn;

    move-result-object v1

    invoke-virtual {v1}, Lgn;->a()I

    move-result v1

    if-le v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a(Landroid/view/View;Ljd;)V
    .locals 2

    .prologue
    .line 2864
    invoke-super {p0, p1, p2}, Ler;->a(Landroid/view/View;Ljd;)V

    .line 2865
    const-class v0, Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljd;->a(Ljava/lang/CharSequence;)V

    .line 2866
    invoke-direct {p0}, Lhw;->a()Z

    move-result v0

    invoke-virtual {p2, v0}, Ljd;->c(Z)V

    .line 2867
    iget-object v0, p0, Lhw;->b:Landroid/support/v4/view/ViewPager;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->canScrollHorizontally(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2868
    const/16 v0, 0x1000

    invoke-virtual {p2, v0}, Ljd;->a(I)V

    .line 2870
    :cond_0
    iget-object v0, p0, Lhw;->b:Landroid/support/v4/view/ViewPager;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->canScrollHorizontally(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2871
    const/16 v0, 0x2000

    invoke-virtual {p2, v0}, Ljd;->a(I)V

    .line 2873
    :cond_1
    return-void
.end method

.method public final a(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 4

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 2877
    invoke-super {p0, p1, p2, p3}, Ler;->a(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 2894
    :goto_0
    return v0

    .line 2880
    :cond_0
    sparse-switch p2, :sswitch_data_0

    move v0, v1

    .line 2894
    goto :goto_0

    .line 2882
    :sswitch_0
    iget-object v2, p0, Lhw;->b:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v2, v0}, Landroid/support/v4/view/ViewPager;->canScrollHorizontally(I)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 2883
    iget-object v1, p0, Lhw;->b:Landroid/support/v4/view/ViewPager;

    iget-object v2, p0, Lhw;->b:Landroid/support/v4/view/ViewPager;

    invoke-static {v2}, Landroid/support/v4/view/ViewPager;->b(Landroid/support/v4/view/ViewPager;)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v1, v2}, Landroid/support/v4/view/ViewPager;->a(I)V

    goto :goto_0

    :cond_1
    move v0, v1

    .line 2886
    goto :goto_0

    .line 2888
    :sswitch_1
    iget-object v2, p0, Lhw;->b:Landroid/support/v4/view/ViewPager;

    const/4 v3, -0x1

    invoke-virtual {v2, v3}, Landroid/support/v4/view/ViewPager;->canScrollHorizontally(I)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 2889
    iget-object v1, p0, Lhw;->b:Landroid/support/v4/view/ViewPager;

    iget-object v2, p0, Lhw;->b:Landroid/support/v4/view/ViewPager;

    invoke-static {v2}, Landroid/support/v4/view/ViewPager;->b(Landroid/support/v4/view/ViewPager;)I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v1, v2}, Landroid/support/v4/view/ViewPager;->a(I)V

    goto :goto_0

    :cond_2
    move v0, v1

    .line 2892
    goto :goto_0

    .line 2880
    nop

    :sswitch_data_0
    .sparse-switch
        0x1000 -> :sswitch_0
        0x2000 -> :sswitch_1
    .end sparse-switch
.end method

.method public final d(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 3

    .prologue
    .line 2850
    invoke-super {p0, p1, p2}, Ler;->d(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2851
    const-class v0, Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V

    .line 2852
    invoke-static {}, Ljx;->a()Ljx;

    move-result-object v0

    .line 2853
    invoke-direct {p0}, Lhw;->a()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljx;->a(Z)V

    .line 2854
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result v1

    const/16 v2, 0x1000

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lhw;->b:Landroid/support/v4/view/ViewPager;

    invoke-static {v1}, Landroid/support/v4/view/ViewPager;->a(Landroid/support/v4/view/ViewPager;)Lgn;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 2856
    iget-object v1, p0, Lhw;->b:Landroid/support/v4/view/ViewPager;

    invoke-static {v1}, Landroid/support/v4/view/ViewPager;->a(Landroid/support/v4/view/ViewPager;)Lgn;

    move-result-object v1

    invoke-virtual {v1}, Lgn;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Ljx;->a(I)V

    .line 2857
    iget-object v1, p0, Lhw;->b:Landroid/support/v4/view/ViewPager;

    invoke-static {v1}, Landroid/support/v4/view/ViewPager;->b(Landroid/support/v4/view/ViewPager;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljx;->b(I)V

    .line 2858
    iget-object v1, p0, Lhw;->b:Landroid/support/v4/view/ViewPager;

    invoke-static {v1}, Landroid/support/v4/view/ViewPager;->b(Landroid/support/v4/view/ViewPager;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljx;->c(I)V

    .line 2860
    :cond_0
    return-void
.end method
