.class public Lzi;
.super Landroid/view/ViewGroup$MarginLayoutParams;
.source "PG"


# instance fields
.field public c:Lzr;

.field public final d:Landroid/graphics/Rect;

.field public e:Z

.field f:Z


# direct methods
.method public constructor <init>(II)V
    .locals 1

    .prologue
    .line 8409
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 8397
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lzi;->d:Landroid/graphics/Rect;

    .line 8398
    const/4 v0, 0x1

    iput-boolean v0, p0, Lzi;->e:Z

    .line 8402
    const/4 v0, 0x0

    iput-boolean v0, p0, Lzi;->f:Z

    .line 8410
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 8405
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 8397
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lzi;->d:Landroid/graphics/Rect;

    .line 8398
    const/4 v0, 0x1

    iput-boolean v0, p0, Lzi;->e:Z

    .line 8402
    const/4 v0, 0x0

    iput-boolean v0, p0, Lzi;->f:Z

    .line 8406
    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .prologue
    .line 8417
    invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 8397
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lzi;->d:Landroid/graphics/Rect;

    .line 8398
    const/4 v0, 0x1

    iput-boolean v0, p0, Lzi;->e:Z

    .line 8402
    const/4 v0, 0x0

    iput-boolean v0, p0, Lzi;->f:Z

    .line 8418
    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$MarginLayoutParams;)V
    .locals 1

    .prologue
    .line 8413
    invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    .line 8397
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lzi;->d:Landroid/graphics/Rect;

    .line 8398
    const/4 v0, 0x1

    iput-boolean v0, p0, Lzi;->e:Z

    .line 8402
    const/4 v0, 0x0

    iput-boolean v0, p0, Lzi;->f:Z

    .line 8414
    return-void
.end method

.method public constructor <init>(Lzi;)V
    .locals 1

    .prologue
    .line 8421
    invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 8397
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lzi;->d:Landroid/graphics/Rect;

    .line 8398
    const/4 v0, 0x1

    iput-boolean v0, p0, Lzi;->e:Z

    .line 8402
    const/4 v0, 0x0

    iput-boolean v0, p0, Lzi;->f:Z

    .line 8422
    return-void
.end method
