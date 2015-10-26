.class public Lcom/google/android/apps/chromecast/app/widget/BoundedLinearLayout;
.super Landroid/widget/LinearLayout;
.source "PG"


# instance fields
.field private final a:I

.field private final b:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 20
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 21
    iput v0, p0, Lcom/google/android/apps/chromecast/app/widget/BoundedLinearLayout;->a:I

    .line 22
    iput v0, p0, Lcom/google/android/apps/chromecast/app/widget/BoundedLinearLayout;->b:I

    .line 23
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .prologue
    const/4 v2, -0x1

    .line 26
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 27
    sget-object v0, Lanc;->a:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 28
    sget v1, Lanc;->c:I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    iput v1, p0, Lcom/google/android/apps/chromecast/app/widget/BoundedLinearLayout;->a:I

    .line 29
    sget v1, Lanc;->b:I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    iput v1, p0, Lcom/google/android/apps/chromecast/app/widget/BoundedLinearLayout;->b:I

    .line 30
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 31
    return-void
.end method


# virtual methods
.method protected onMeasure(II)V
    .locals 2

    .prologue
    .line 35
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    .line 36
    iget v1, p0, Lcom/google/android/apps/chromecast/app/widget/BoundedLinearLayout;->a:I

    if-lez v1, :cond_0

    iget v1, p0, Lcom/google/android/apps/chromecast/app/widget/BoundedLinearLayout;->a:I

    if-ge v1, v0, :cond_0

    .line 37
    iget v0, p0, Lcom/google/android/apps/chromecast/app/widget/BoundedLinearLayout;->a:I

    .line 38
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    .line 37
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    .line 40
    :cond_0
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    .line 41
    iget v1, p0, Lcom/google/android/apps/chromecast/app/widget/BoundedLinearLayout;->b:I

    if-lez v1, :cond_1

    iget v1, p0, Lcom/google/android/apps/chromecast/app/widget/BoundedLinearLayout;->b:I

    if-ge v1, v0, :cond_1

    .line 42
    iget v0, p0, Lcom/google/android/apps/chromecast/app/widget/BoundedLinearLayout;->b:I

    .line 43
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    .line 42
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 45
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    .line 46
    return-void
.end method
