.class public Lqw;
.super Landroid/view/ViewGroup;
.source "PG"


# static fields
.field private static final g:Landroid/view/animation/Interpolator;


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Landroid/support/v7/widget/ActionMenuView;

.field public c:Lvu;

.field public d:Landroid/view/ViewGroup;

.field public e:I

.field public f:Lih;

.field private h:Lqx;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 38
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    sput-object v0, Lqw;->g:Landroid/view/animation/Interpolator;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 57
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lqw;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 58
    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 61
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lqw;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 62
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .prologue
    .line 65
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 42
    new-instance v0, Lqx;

    invoke-direct {v0, p0}, Lqx;-><init>(Lqw;)V

    iput-object v0, p0, Lqw;->h:Lqx;

    .line 67
    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 68
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    sget v2, La;->g:I

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    iget v1, v0, Landroid/util/TypedValue;->resourceId:I

    if-eqz v1, :cond_0

    .line 70
    new-instance v1, Landroid/view/ContextThemeWrapper;

    iget v0, v0, Landroid/util/TypedValue;->resourceId:I

    invoke-direct {v1, p1, v0}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    iput-object v1, p0, Lqw;->a:Landroid/content/Context;

    .line 74
    :goto_0
    return-void

    .line 72
    :cond_0
    iput-object p1, p0, Lqw;->a:Landroid/content/Context;

    goto :goto_0
.end method

.method public static a(IIZ)I
    .locals 1

    .prologue
    .line 238
    if-eqz p2, :cond_0

    sub-int v0, p0, p1

    :goto_0
    return v0

    :cond_0
    add-int v0, p0, p1

    goto :goto_0
.end method

.method public static a(Landroid/view/View;III)I
    .locals 2

    .prologue
    .line 228
    const/high16 v0, -0x80000000

    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {p0, v0, p2}, Landroid/view/View;->measure(II)V

    .line 231
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    sub-int v0, p1, v0

    .line 234
    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method public static a(Landroid/view/View;IIIZ)I
    .locals 4

    .prologue
    .line 242
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    .line 243
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    .line 244
    sub-int v2, p3, v1

    div-int/lit8 v2, v2, 0x2

    add-int/2addr v2, p2

    .line 246
    if-eqz p4, :cond_1

    .line 247
    sub-int v3, p1, v0

    add-int/2addr v1, v2

    invoke-virtual {p0, v3, v2, p1, v1}, Landroid/view/View;->layout(IIII)V

    .line 252
    :goto_0
    if-eqz p4, :cond_0

    neg-int v0, v0

    :cond_0
    return v0

    .line 249
    :cond_1
    add-int v3, p1, v0

    add-int/2addr v1, v2

    invoke-virtual {p0, p1, v2, v3, v1}, Landroid/view/View;->layout(IIII)V

    goto :goto_0
.end method


# virtual methods
.method public a(I)V
    .locals 0

    .prologue
    .line 111
    iput p1, p0, Lqw;->e:I

    .line 112
    invoke-virtual {p0}, Lqw;->requestLayout()V

    .line 113
    return-void
.end method

.method public a()Z
    .locals 1

    .prologue
    .line 177
    iget-object v0, p0, Lqw;->c:Lvu;

    if-eqz v0, :cond_0

    .line 178
    iget-object v0, p0, Lqw;->c:Lvu;

    invoke-virtual {v0}, Lvu;->b()Z

    move-result v0

    .line 180
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(I)V
    .locals 4

    .prologue
    const-wide/16 v2, 0xc8

    const/4 v1, 0x0

    .line 134
    iget-object v0, p0, Lqw;->f:Lih;

    if-eqz v0, :cond_0

    .line 135
    iget-object v0, p0, Lqw;->f:Lih;

    invoke-virtual {v0}, Lih;->a()V

    .line 137
    :cond_0
    if-nez p1, :cond_2

    .line 138
    invoke-virtual {p0}, Lqw;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_1

    .line 139
    invoke-static {p0, v1}, Lgt;->c(Landroid/view/View;F)V

    .line 144
    :cond_1
    invoke-static {p0}, Lgt;->o(Landroid/view/View;)Lih;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lih;->a(F)Lih;

    move-result-object v0

    .line 145
    invoke-virtual {v0, v2, v3}, Lih;->a(J)Lih;

    .line 146
    sget-object v1, Lqw;->g:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, v1}, Lih;->a(Landroid/view/animation/Interpolator;)Lih;

    .line 155
    iget-object v1, p0, Lqw;->h:Lqx;

    invoke-virtual {v1, v0, p1}, Lqx;->a(Lih;I)Lqx;

    move-result-object v1

    invoke-virtual {v0, v1}, Lih;->a(Liu;)Lih;

    .line 156
    invoke-virtual {v0}, Lih;->b()V

    .line 174
    :goto_0
    return-void

    .line 159
    :cond_2
    invoke-static {p0}, Lgt;->o(Landroid/view/View;)Lih;

    move-result-object v0

    invoke-virtual {v0, v1}, Lih;->a(F)Lih;

    move-result-object v0

    .line 160
    invoke-virtual {v0, v2, v3}, Lih;->a(J)Lih;

    .line 161
    sget-object v1, Lqw;->g:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, v1}, Lih;->a(Landroid/view/animation/Interpolator;)Lih;

    .line 170
    iget-object v1, p0, Lqw;->h:Lqx;

    invoke-virtual {v1, v0, p1}, Lqx;->a(Lih;I)Lqx;

    move-result-object v1

    invoke-virtual {v0, v1}, Lih;->a(Liu;)Lih;

    .line 171
    invoke-virtual {v0}, Lih;->b()V

    goto :goto_0
.end method

.method protected onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 78
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x8

    if-lt v0, v1, :cond_0

    .line 79
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 84
    :cond_0
    invoke-virtual {p0}, Lqw;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    sget-object v2, Loq;->a:[I

    sget v3, La;->i:I

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 86
    sget v1, Loq;->j:I

    invoke-virtual {v0, v1, v4}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    move-result v1

    invoke-virtual {p0, v1}, Lqw;->a(I)V

    .line 87
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 89
    iget-object v0, p0, Lqw;->c:Lvu;

    if-eqz v0, :cond_2

    .line 90
    iget-object v0, p0, Lqw;->c:Lvu;

    .line 1130
    iget-boolean v1, v0, Lvu;->h:Z

    if-nez v1, :cond_1

    .line 1131
    iget-object v1, v0, Lvu;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, La;->bA:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v1

    iput v1, v0, Lvu;->g:I

    .line 1134
    :cond_1
    iget-object v1, v0, Lvu;->c:Lqa;

    if-eqz v1, :cond_2

    .line 1135
    iget-object v0, v0, Lvu;->c:Lqa;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lqa;->b(Z)V

    .line 92
    :cond_2
    return-void
.end method
