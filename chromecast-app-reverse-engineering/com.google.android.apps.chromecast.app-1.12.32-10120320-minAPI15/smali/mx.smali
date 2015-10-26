.class public final Lmx;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field A:Landroid/widget/TextView;

.field B:Landroid/widget/TextView;

.field public C:Landroid/view/View;

.field public D:Landroid/widget/ListAdapter;

.field public E:I

.field F:I

.field G:I

.field public H:I

.field I:I

.field public J:I

.field K:Landroid/os/Handler;

.field final L:Landroid/view/View$OnClickListener;

.field private M:I

.field private N:I

.field final a:Landroid/content/Context;

.field final b:Lny;

.field final c:Landroid/view/Window;

.field d:Ljava/lang/CharSequence;

.field e:Ljava/lang/CharSequence;

.field public f:Landroid/widget/ListView;

.field g:Landroid/view/View;

.field h:I

.field i:I

.field j:I

.field k:I

.field l:I

.field m:Z

.field n:Landroid/widget/Button;

.field o:Ljava/lang/CharSequence;

.field p:Landroid/os/Message;

.field q:Landroid/widget/Button;

.field r:Ljava/lang/CharSequence;

.field s:Landroid/os/Message;

.field t:Landroid/widget/Button;

.field u:Ljava/lang/CharSequence;

.field v:Landroid/os/Message;

.field w:Landroid/widget/ScrollView;

.field public x:I

.field public y:Landroid/graphics/drawable/Drawable;

.field public z:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lny;Landroid/view/Window;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 168
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    iput-boolean v3, p0, Lmx;->m:Z

    .line 89
    iput v3, p0, Lmx;->x:I

    .line 99
    const/4 v0, -0x1

    iput v0, p0, Lmx;->E:I

    .line 108
    iput v3, p0, Lmx;->N:I

    .line 112
    new-instance v0, Lmy;

    invoke-direct {v0, p0}, Lmy;-><init>(Lmx;)V

    iput-object v0, p0, Lmx;->L:Landroid/view/View$OnClickListener;

    .line 169
    iput-object p1, p0, Lmx;->a:Landroid/content/Context;

    .line 170
    iput-object p2, p0, Lmx;->b:Lny;

    .line 171
    iput-object p3, p0, Lmx;->c:Landroid/view/Window;

    .line 172
    new-instance v0, Lnb;

    invoke-direct {v0, p2}, Lnb;-><init>(Landroid/content/DialogInterface;)V

    iput-object v0, p0, Lmx;->K:Landroid/os/Handler;

    .line 174
    const/4 v0, 0x0

    sget-object v1, Loq;->H:[I

    sget v2, La;->u:I

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 177
    sget v1, Loq;->I:I

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Lmx;->F:I

    .line 178
    sget v1, Loq;->J:I

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Lmx;->G:I

    .line 180
    sget v1, Loq;->L:I

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Lmx;->H:I

    .line 181
    sget v1, Loq;->M:I

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Lmx;->I:I

    .line 182
    sget v1, Loq;->N:I

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Lmx;->M:I

    .line 184
    sget v1, Loq;->K:I

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Lmx;->J:I

    .line 186
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 187
    return-void
.end method

.method static a(Landroid/widget/Button;)V
    .locals 2

    .prologue
    .line 607
    invoke-virtual {p0}, Landroid/widget/Button;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 608
    const/4 v1, 0x1

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 609
    const/high16 v1, 0x3f000000    # 0.5f

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 610
    invoke-virtual {p0, v0}, Landroid/widget/Button;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 611
    return-void
.end method

.method static a(Landroid/view/View;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 190
    invoke-virtual {p0}, Landroid/view/View;->onCheckIsTextEditor()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 208
    :goto_0
    return v0

    .line 194
    :cond_0
    instance-of v2, p0, Landroid/view/ViewGroup;

    if-nez v2, :cond_1

    move v0, v1

    .line 195
    goto :goto_0

    .line 198
    :cond_1
    check-cast p0, Landroid/view/ViewGroup;

    .line 199
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    .line 200
    :cond_2
    if-lez v2, :cond_3

    .line 201
    add-int/lit8 v2, v2, -0x1

    .line 202
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 203
    invoke-static {v3}, Lmx;->a(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_3
    move v0, v1

    .line 208
    goto :goto_0
.end method


# virtual methods
.method public final a(Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 231
    iput-object p1, p0, Lmx;->d:Ljava/lang/CharSequence;

    .line 232
    iget-object v0, p0, Lmx;->A:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 233
    iget-object v0, p0, Lmx;->A:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 235
    :cond_0
    return-void
.end method
