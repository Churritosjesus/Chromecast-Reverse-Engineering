.class public Lqn;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnKeyListener;
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Landroid/widget/PopupWindow$OnDismissListener;
.implements Lqp;


# static fields
.field static final a:I


# instance fields
.field public b:Landroid/view/View;

.field public c:Lyc;

.field public d:Lqq;

.field public e:Z

.field public f:I

.field private final g:Landroid/content/Context;

.field private final h:Landroid/view/LayoutInflater;

.field private final i:Lqa;

.field private final j:Lqo;

.field private final k:Z

.field private final l:I

.field private final m:I

.field private final n:I

.field private o:Landroid/view/ViewTreeObserver;

.field private p:Landroid/view/ViewGroup;

.field private q:Z

.field private r:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 51
    sget v0, La;->bN:I

    sput v0, Lqn;->a:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lqa;Landroid/view/View;)V
    .locals 6

    .prologue
    .line 84
    const/4 v4, 0x0

    sget v5, La;->L:I

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lqn;-><init>(Landroid/content/Context;Lqa;Landroid/view/View;ZI)V

    .line 85
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lqa;Landroid/view/View;ZI)V
    .locals 7

    .prologue
    .line 89
    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v6}, Lqn;-><init>(Landroid/content/Context;Lqa;Landroid/view/View;ZII)V

    .line 90
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lqa;Landroid/view/View;ZII)V
    .locals 3

    .prologue
    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    const/4 v0, 0x0

    iput v0, p0, Lqn;->f:I

    .line 94
    iput-object p1, p0, Lqn;->g:Landroid/content/Context;

    .line 95
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lqn;->h:Landroid/view/LayoutInflater;

    .line 96
    iput-object p2, p0, Lqn;->i:Lqa;

    .line 97
    new-instance v0, Lqo;

    iget-object v1, p0, Lqn;->i:Lqa;

    invoke-direct {v0, p0, v1}, Lqo;-><init>(Lqn;Lqa;)V

    iput-object v0, p0, Lqn;->j:Lqo;

    .line 98
    iput-boolean p4, p0, Lqn;->k:Z

    .line 99
    iput p5, p0, Lqn;->m:I

    .line 100
    iput p6, p0, Lqn;->n:I

    .line 102
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 103
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    div-int/lit8 v1, v1, 0x2

    sget v2, La;->ab:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Lqn;->l:I

    .line 106
    iput-object p3, p0, Lqn;->b:Landroid/view/View;

    .line 109
    invoke-virtual {p2, p0, p1}, Lqa;->a(Lqp;Landroid/content/Context;)V

    .line 110
    return-void
.end method

.method static synthetic a(Lqn;)Z
    .locals 1

    .prologue
    .line 45
    iget-boolean v0, p0, Lqn;->k:Z

    return v0
.end method

.method static synthetic b(Lqn;)Landroid/view/LayoutInflater;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lqn;->h:Landroid/view/LayoutInflater;

    return-object v0
.end method

.method static synthetic c(Lqn;)Lqa;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lqn;->i:Lqa;

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/content/Context;Lqa;)V
    .locals 0

    .prologue
    .line 249
    return-void
.end method

.method public final a(Lqa;Z)V
    .locals 1

    .prologue
    .line 300
    iget-object v0, p0, Lqn;->i:Lqa;

    if-eq p1, v0, :cond_1

    .line 306
    :cond_0
    :goto_0
    return-void

    .line 302
    :cond_1
    invoke-virtual {p0}, Lqn;->d()V

    .line 303
    iget-object v0, p0, Lqn;->d:Lqq;

    if-eqz v0, :cond_0

    .line 304
    iget-object v0, p0, Lqn;->d:Lqq;

    invoke-interface {v0, p1, p2}, Lqq;->a(Lqa;Z)V

    goto :goto_0
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 310
    const/4 v0, 0x0

    return v0
.end method

.method public final a(Lqu;)Z
    .locals 7

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 272
    invoke-virtual {p1}, Lqu;->hasVisibleItems()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 273
    new-instance v3, Lqn;

    iget-object v0, p0, Lqn;->g:Landroid/content/Context;

    iget-object v4, p0, Lqn;->b:Landroid/view/View;

    invoke-direct {v3, v0, p1, v4}, Lqn;-><init>(Landroid/content/Context;Lqa;Landroid/view/View;)V

    .line 274
    iget-object v0, p0, Lqn;->d:Lqq;

    .line 5267
    iput-object v0, v3, Lqn;->d:Lqq;

    .line 277
    invoke-virtual {p1}, Lqu;->size()I

    move-result v4

    move v0, v2

    .line 278
    :goto_0
    if-ge v0, v4, :cond_3

    .line 279
    invoke-virtual {p1, v0}, Lqu;->getItem(I)Landroid/view/MenuItem;

    move-result-object v5

    .line 280
    invoke-interface {v5}, Landroid/view/MenuItem;->isVisible()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v5}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v5

    if-eqz v5, :cond_1

    move v0, v1

    .line 6117
    :goto_1
    iput-boolean v0, v3, Lqn;->e:Z

    .line 287
    invoke-virtual {v3}, Lqn;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 288
    iget-object v0, p0, Lqn;->d:Lqq;

    if-eqz v0, :cond_0

    .line 289
    iget-object v0, p0, Lqn;->d:Lqq;

    invoke-interface {v0, p1}, Lqq;->a_(Lqa;)Z

    .line 294
    :cond_0
    :goto_2
    return v1

    .line 278
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    move v1, v2

    .line 294
    goto :goto_2

    :cond_3
    move v0, v2

    goto :goto_1
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 125
    invoke-virtual {p0}, Lqn;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 126
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "MenuPopupHelper cannot be used without an anchor"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 128
    :cond_0
    return-void
.end method

.method public final b(Z)V
    .locals 1

    .prologue
    .line 258
    const/4 v0, 0x0

    iput-boolean v0, p0, Lqn;->q:Z

    .line 260
    iget-object v0, p0, Lqn;->j:Lqo;

    if-eqz v0, :cond_0

    .line 261
    iget-object v0, p0, Lqn;->j:Lqo;

    invoke-virtual {v0}, Lqo;->notifyDataSetChanged()V

    .line 263
    :cond_0
    return-void
.end method

.method public final b(Lqe;)Z
    .locals 1

    .prologue
    .line 314
    const/4 v0, 0x0

    return v0
.end method

.method public final c()Z
    .locals 12

    .prologue
    const/4 v4, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 135
    new-instance v0, Lyc;

    iget-object v3, p0, Lqn;->g:Landroid/content/Context;

    iget v5, p0, Lqn;->m:I

    iget v6, p0, Lqn;->n:I

    invoke-direct {v0, v3, v4, v5, v6}, Lyc;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    iput-object v0, p0, Lqn;->c:Lyc;

    .line 136
    iget-object v0, p0, Lqn;->c:Lyc;

    invoke-virtual {v0, p0}, Lyc;->a(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 137
    iget-object v0, p0, Lqn;->c:Lyc;

    .line 1541
    iput-object p0, v0, Lyc;->h:Landroid/widget/AdapterView$OnItemClickListener;

    .line 138
    iget-object v0, p0, Lqn;->c:Lyc;

    iget-object v3, p0, Lqn;->j:Lqo;

    invoke-virtual {v0, v3}, Lyc;->a(Landroid/widget/ListAdapter;)V

    .line 139
    iget-object v0, p0, Lqn;->c:Lyc;

    invoke-virtual {v0, v1}, Lyc;->a(Z)V

    .line 141
    iget-object v3, p0, Lqn;->b:Landroid/view/View;

    .line 142
    if-eqz v3, :cond_5

    .line 143
    iget-object v0, p0, Lqn;->o:Landroid/view/ViewTreeObserver;

    if-nez v0, :cond_4

    move v0, v1

    .line 144
    :goto_0
    invoke-virtual {v3}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v5

    iput-object v5, p0, Lqn;->o:Landroid/view/ViewTreeObserver;

    .line 145
    if-eqz v0, :cond_0

    iget-object v0, p0, Lqn;->o:Landroid/view/ViewTreeObserver;

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 146
    :cond_0
    iget-object v0, p0, Lqn;->c:Lyc;

    .line 2435
    iput-object v3, v0, Lyc;->g:Landroid/view/View;

    .line 147
    iget-object v0, p0, Lqn;->c:Lyc;

    iget v3, p0, Lqn;->f:I

    .line 2481
    iput v3, v0, Lyc;->d:I

    .line 152
    iget-boolean v0, p0, Lqn;->q:Z

    if-nez v0, :cond_3

    .line 3204
    iget-object v7, p0, Lqn;->j:Lqo;

    .line 3205
    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v8

    .line 3206
    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v9

    .line 3207
    invoke-interface {v7}, Landroid/widget/ListAdapter;->getCount()I

    move-result v10

    move v6, v2

    move v3, v2

    move-object v5, v4

    .line 3208
    :goto_1
    if-ge v6, v10, :cond_2

    .line 3209
    invoke-interface {v7, v6}, Landroid/widget/ListAdapter;->getItemViewType(I)I

    move-result v0

    .line 3210
    if-eq v0, v3, :cond_7

    move v3, v0

    move-object v0, v4

    .line 3215
    :goto_2
    iget-object v5, p0, Lqn;->p:Landroid/view/ViewGroup;

    if-nez v5, :cond_1

    .line 3216
    new-instance v5, Landroid/widget/FrameLayout;

    iget-object v11, p0, Lqn;->g:Landroid/content/Context;

    invoke-direct {v5, v11}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v5, p0, Lqn;->p:Landroid/view/ViewGroup;

    .line 3219
    :cond_1
    iget-object v5, p0, Lqn;->p:Landroid/view/ViewGroup;

    invoke-interface {v7, v6, v0, v5}, Landroid/widget/ListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 3220
    invoke-virtual {v5, v8, v9}, Landroid/view/View;->measure(II)V

    .line 3222
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    .line 3223
    iget v11, p0, Lqn;->l:I

    if-lt v0, v11, :cond_6

    .line 3224
    iget v2, p0, Lqn;->l:I

    .line 153
    :cond_2
    iput v2, p0, Lqn;->r:I

    .line 154
    iput-boolean v1, p0, Lqn;->q:Z

    .line 157
    :cond_3
    iget-object v0, p0, Lqn;->c:Lyc;

    iget v2, p0, Lqn;->r:I

    invoke-virtual {v0, v2}, Lyc;->a(I)V

    .line 158
    iget-object v0, p0, Lqn;->c:Lyc;

    .line 3710
    iget-object v0, v0, Lyc;->b:Landroid/widget/PopupWindow;

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 159
    iget-object v0, p0, Lqn;->c:Lyc;

    invoke-virtual {v0}, Lyc;->c()V

    .line 160
    iget-object v0, p0, Lqn;->c:Lyc;

    .line 3845
    iget-object v0, v0, Lyc;->c:Lyf;

    .line 160
    invoke-virtual {v0, p0}, Landroid/widget/ListView;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 161
    :goto_3
    return v1

    :cond_4
    move v0, v2

    .line 143
    goto :goto_0

    :cond_5
    move v1, v2

    .line 149
    goto :goto_3

    .line 3225
    :cond_6
    if-le v0, v2, :cond_8

    .line 3208
    :goto_4
    add-int/lit8 v2, v6, 0x1

    move v6, v2

    move v2, v0

    goto :goto_1

    :cond_7
    move-object v0, v5

    goto :goto_2

    :cond_8
    move v0, v2

    goto :goto_4
.end method

.method public final c(Lqe;)Z
    .locals 1

    .prologue
    .line 318
    const/4 v0, 0x0

    return v0
.end method

.method public final d()V
    .locals 1

    .prologue
    .line 165
    invoke-virtual {p0}, Lqn;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 166
    iget-object v0, p0, Lqn;->c:Lyc;

    invoke-virtual {v0}, Lyc;->a()V

    .line 168
    :cond_0
    return-void
.end method

.method public final e()Z
    .locals 1

    .prologue
    .line 181
    iget-object v0, p0, Lqn;->c:Lyc;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqn;->c:Lyc;

    .line 4760
    iget-object v0, v0, Lyc;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    .line 181
    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onDismiss()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 171
    iput-object v1, p0, Lqn;->c:Lyc;

    .line 172
    iget-object v0, p0, Lqn;->i:Lqa;

    invoke-virtual {v0}, Lqa;->close()V

    .line 173
    iget-object v0, p0, Lqn;->o:Landroid/view/ViewTreeObserver;

    if-eqz v0, :cond_1

    .line 174
    iget-object v0, p0, Lqn;->o:Landroid/view/ViewTreeObserver;

    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lqn;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iput-object v0, p0, Lqn;->o:Landroid/view/ViewTreeObserver;

    .line 175
    :cond_0
    iget-object v0, p0, Lqn;->o:Landroid/view/ViewTreeObserver;

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 176
    iput-object v1, p0, Lqn;->o:Landroid/view/ViewTreeObserver;

    .line 178
    :cond_1
    return-void
.end method

.method public onGlobalLayout()V
    .locals 1

    .prologue
    .line 235
    invoke-virtual {p0}, Lqn;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 236
    iget-object v0, p0, Lqn;->b:Landroid/view/View;

    .line 237
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    move-result v0

    if-nez v0, :cond_2

    .line 238
    :cond_0
    invoke-virtual {p0}, Lqn;->d()V

    .line 244
    :cond_1
    :goto_0
    return-void

    .line 239
    :cond_2
    invoke-virtual {p0}, Lqn;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 241
    iget-object v0, p0, Lqn;->c:Lyc;

    invoke-virtual {v0}, Lyc;->c()V

    goto :goto_0
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 4

    .prologue
    .line 186
    iget-object v0, p0, Lqn;->j:Lqo;

    .line 187
    invoke-static {v0}, Lqo;->a(Lqo;)Lqa;

    move-result-object v1

    invoke-virtual {v0, p3}, Lqo;->a(I)Lqe;

    move-result-object v0

    const/4 v2, 0x0

    .line 4948
    const/4 v3, 0x0

    invoke-virtual {v1, v0, v3, v2}, Lqa;->a(Landroid/view/MenuItem;Lqp;I)Z

    .line 188
    return-void
.end method

.method public onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 191
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v1

    if-ne v1, v0, :cond_0

    const/16 v1, 0x52

    if-ne p2, v1, :cond_0

    .line 192
    invoke-virtual {p0}, Lqn;->d()V

    .line 195
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
