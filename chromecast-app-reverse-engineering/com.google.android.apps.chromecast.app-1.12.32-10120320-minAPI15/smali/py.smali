.class public final Lpy;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Lqp;


# instance fields
.field a:Landroid/view/LayoutInflater;

.field b:Lqa;

.field c:I

.field public d:Lqq;

.field private e:Landroid/content/Context;

.field private f:Landroid/support/v7/internal/view/menu/ExpandedMenuView;

.field private g:I

.field private h:Lpz;


# direct methods
.method private constructor <init>(II)V
    .locals 1

    .prologue
    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    iput p1, p0, Lpy;->c:I

    .line 79
    const/4 v0, 0x0

    iput v0, p0, Lpy;->g:I

    .line 80
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    .prologue
    .line 67
    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Lpy;-><init>(II)V

    .line 68
    iput-object p1, p0, Lpy;->e:Landroid/content/Context;

    .line 69
    iget-object v0, p0, Lpy;->e:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lpy;->a:Landroid/view/LayoutInflater;

    .line 70
    return-void
.end method

.method static synthetic a(Lpy;)I
    .locals 1

    .prologue
    .line 40
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final a(Landroid/view/ViewGroup;)Lqr;
    .locals 3

    .prologue
    .line 101
    iget-object v0, p0, Lpy;->f:Landroid/support/v7/internal/view/menu/ExpandedMenuView;

    if-nez v0, :cond_1

    .line 102
    iget-object v0, p0, Lpy;->a:Landroid/view/LayoutInflater;

    sget v1, La;->bI:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/internal/view/menu/ExpandedMenuView;

    iput-object v0, p0, Lpy;->f:Landroid/support/v7/internal/view/menu/ExpandedMenuView;

    .line 104
    iget-object v0, p0, Lpy;->h:Lpz;

    if-nez v0, :cond_0

    .line 105
    new-instance v0, Lpz;

    invoke-direct {v0, p0}, Lpz;-><init>(Lpy;)V

    iput-object v0, p0, Lpy;->h:Lpz;

    .line 107
    :cond_0
    iget-object v0, p0, Lpy;->f:Landroid/support/v7/internal/view/menu/ExpandedMenuView;

    iget-object v1, p0, Lpy;->h:Lpz;

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/ExpandedMenuView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 108
    iget-object v0, p0, Lpy;->f:Landroid/support/v7/internal/view/menu/ExpandedMenuView;

    invoke-virtual {v0, p0}, Landroid/support/v7/internal/view/menu/ExpandedMenuView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 110
    :cond_1
    iget-object v0, p0, Lpy;->f:Landroid/support/v7/internal/view/menu/ExpandedMenuView;

    return-object v0
.end method

.method public final a(Landroid/content/Context;Lqa;)V
    .locals 2

    .prologue
    .line 84
    iget v0, p0, Lpy;->g:I

    if-eqz v0, :cond_2

    .line 85
    new-instance v0, Landroid/view/ContextThemeWrapper;

    iget v1, p0, Lpy;->g:I

    invoke-direct {v0, p1, v1}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lpy;->e:Landroid/content/Context;

    .line 86
    iget-object v0, p0, Lpy;->e:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lpy;->a:Landroid/view/LayoutInflater;

    .line 93
    :cond_0
    :goto_0
    iput-object p2, p0, Lpy;->b:Lqa;

    .line 94
    iget-object v0, p0, Lpy;->h:Lpz;

    if-eqz v0, :cond_1

    .line 95
    iget-object v0, p0, Lpy;->h:Lpz;

    invoke-virtual {v0}, Lpz;->notifyDataSetChanged()V

    .line 97
    :cond_1
    return-void

    .line 87
    :cond_2
    iget-object v0, p0, Lpy;->e:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 88
    iput-object p1, p0, Lpy;->e:Landroid/content/Context;

    .line 89
    iget-object v0, p0, Lpy;->a:Landroid/view/LayoutInflater;

    if-nez v0, :cond_0

    .line 90
    iget-object v0, p0, Lpy;->e:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lpy;->a:Landroid/view/LayoutInflater;

    goto :goto_0
.end method

.method public final a(Lqa;Z)V
    .locals 1

    .prologue
    .line 151
    iget-object v0, p0, Lpy;->d:Lqq;

    if-eqz v0, :cond_0

    .line 152
    iget-object v0, p0, Lpy;->d:Lqq;

    invoke-interface {v0, p1, p2}, Lqq;->a(Lqa;Z)V

    .line 154
    :cond_0
    return-void
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 174
    const/4 v0, 0x0

    return v0
.end method

.method public final a(Lqu;)Z
    .locals 12

    .prologue
    const/4 v2, 0x1

    const/4 v0, 0x0

    const/4 v11, 0x0

    .line 139
    invoke-virtual {p1}, Lqu;->hasVisibleItems()Z

    move-result v1

    if-nez v1, :cond_0

    .line 146
    :goto_0
    return v0

    .line 142
    :cond_0
    new-instance v3, Lqd;

    invoke-direct {v3, p1}, Lqd;-><init>(Lqa;)V

    .line 2054
    iget-object v1, v3, Lqd;->a:Lqa;

    .line 2057
    new-instance v4, Lne;

    .line 2807
    iget-object v5, v1, Lqa;->a:Landroid/content/Context;

    .line 2057
    invoke-direct {v4, v5}, Lne;-><init>(Landroid/content/Context;)V

    .line 2059
    new-instance v5, Lpy;

    .line 3295
    iget-object v6, v4, Lne;->a:Lmz;

    iget-object v6, v6, Lmz;->a:Landroid/content/Context;

    .line 2059
    sget v7, La;->bL:I

    invoke-direct {v5, v6, v7}, Lpy;-><init>(Landroid/content/Context;I)V

    iput-object v5, v3, Lqd;->c:Lpy;

    .line 2062
    iget-object v5, v3, Lqd;->c:Lpy;

    .line 4134
    iput-object v3, v5, Lpy;->d:Lqq;

    .line 2063
    iget-object v5, v3, Lqd;->a:Lqa;

    iget-object v6, v3, Lqd;->c:Lpy;

    invoke-virtual {v5, v6}, Lqa;->a(Lqp;)V

    .line 2064
    iget-object v5, v3, Lqd;->c:Lpy;

    invoke-virtual {v5}, Lpy;->b()Landroid/widget/ListAdapter;

    move-result-object v5

    .line 4554
    iget-object v6, v4, Lne;->a:Lmz;

    iput-object v5, v6, Lmz;->h:Landroid/widget/ListAdapter;

    .line 4555
    iget-object v5, v4, Lne;->a:Lmz;

    iput-object v3, v5, Lmz;->i:Landroid/content/DialogInterface$OnClickListener;

    .line 5282
    iget-object v5, v1, Lqa;->h:Landroid/view/View;

    .line 2068
    if-eqz v5, :cond_7

    .line 5329
    iget-object v1, v4, Lne;->a:Lmz;

    iput-object v5, v1, Lmz;->e:Landroid/view/View;

    .line 7514
    :goto_1
    iget-object v1, v4, Lne;->a:Lmz;

    iput-object v3, v1, Lmz;->g:Landroid/content/DialogInterface$OnKeyListener;

    .line 7882
    new-instance v5, Lnd;

    iget-object v1, v4, Lne;->a:Lmz;

    iget-object v1, v1, Lmz;->a:Landroid/content/Context;

    iget v6, v4, Lne;->b:I

    invoke-direct {v5, v1, v6}, Lnd;-><init>(Landroid/content/Context;I)V

    .line 7883
    iget-object v6, v4, Lne;->a:Lmz;

    invoke-static {v5}, Lnd;->a(Lnd;)Lmx;

    move-result-object v7

    .line 8677
    iget-object v1, v6, Lmz;->e:Landroid/view/View;

    if-eqz v1, :cond_8

    .line 8678
    iget-object v0, v6, Lmz;->e:Landroid/view/View;

    .line 9241
    iput-object v0, v7, Lmx;->C:Landroid/view/View;

    .line 8710
    :cond_1
    :goto_2
    iget-object v0, v6, Lmz;->h:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_3

    .line 9734
    iget-object v0, v6, Lmz;->b:Landroid/view/LayoutInflater;

    .line 10057
    iget v1, v7, Lmx;->H:I

    .line 9734
    invoke-virtual {v0, v1, v11}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    .line 11057
    iget v8, v7, Lmx;->J:I

    .line 9785
    iget-object v1, v6, Lmz;->h:Landroid/widget/ListAdapter;

    if-eqz v1, :cond_b

    iget-object v1, v6, Lmz;->h:Landroid/widget/ListAdapter;

    .line 12057
    :goto_3
    iput-object v1, v7, Lmx;->D:Landroid/widget/ListAdapter;

    .line 9801
    iget v1, v6, Lmz;->j:I

    .line 13057
    iput v1, v7, Lmx;->E:I

    .line 9803
    iget-object v1, v6, Lmz;->i:Landroid/content/DialogInterface$OnClickListener;

    if-eqz v1, :cond_2

    .line 9804
    new-instance v1, Lna;

    invoke-direct {v1, v6, v7}, Lna;-><init>(Lmz;Lmx;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 14057
    :cond_2
    iput-object v0, v7, Lmx;->f:Landroid/widget/ListView;

    .line 7884
    :cond_3
    iget-object v0, v4, Lne;->a:Lmz;

    iget-boolean v0, v0, Lmz;->f:Z

    invoke-virtual {v5, v0}, Lnd;->setCancelable(Z)V

    .line 7885
    iget-object v0, v4, Lne;->a:Lmz;

    iget-boolean v0, v0, Lmz;->f:Z

    if-eqz v0, :cond_4

    .line 7886
    invoke-virtual {v5, v2}, Lnd;->setCanceledOnTouchOutside(Z)V

    .line 7888
    :cond_4
    invoke-virtual {v5, v11}, Lnd;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 7889
    invoke-virtual {v5, v11}, Lnd;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 7890
    iget-object v0, v4, Lne;->a:Lmz;

    iget-object v0, v0, Lmz;->g:Landroid/content/DialogInterface$OnKeyListener;

    if-eqz v0, :cond_5

    .line 7891
    iget-object v0, v4, Lne;->a:Lmz;

    iget-object v0, v0, Lmz;->g:Landroid/content/DialogInterface$OnKeyListener;

    invoke-virtual {v5, v0}, Lnd;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 2080
    :cond_5
    iput-object v5, v3, Lqd;->b:Lnd;

    .line 2081
    iget-object v0, v3, Lqd;->b:Lnd;

    invoke-virtual {v0, v3}, Lnd;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 2083
    iget-object v0, v3, Lqd;->b:Lnd;

    invoke-virtual {v0}, Lnd;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    .line 2084
    const/16 v1, 0x3eb

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 2088
    iget v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    const/high16 v4, 0x20000

    or-int/2addr v1, v4

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 2090
    iget-object v0, v3, Lqd;->b:Lnd;

    invoke-virtual {v0}, Lnd;->show()V

    .line 143
    iget-object v0, p0, Lpy;->d:Lqq;

    if-eqz v0, :cond_6

    .line 144
    iget-object v0, p0, Lpy;->d:Lqq;

    invoke-interface {v0, p1}, Lqq;->a_(Lqa;)Z

    :cond_6
    move v0, v2

    .line 146
    goto/16 :goto_0

    .line 6278
    :cond_7
    iget-object v5, v1, Lqa;->g:Landroid/graphics/drawable/Drawable;

    .line 6371
    iget-object v6, v4, Lne;->a:Lmz;

    iput-object v5, v6, Lmz;->c:Landroid/graphics/drawable/Drawable;

    .line 7274
    iget-object v1, v1, Lqa;->f:Ljava/lang/CharSequence;

    .line 7314
    iget-object v5, v4, Lne;->a:Lmz;

    iput-object v1, v5, Lmz;->d:Ljava/lang/CharSequence;

    goto/16 :goto_1

    .line 8680
    :cond_8
    iget-object v1, v6, Lmz;->d:Ljava/lang/CharSequence;

    if-eqz v1, :cond_9

    .line 8681
    iget-object v1, v6, Lmz;->d:Ljava/lang/CharSequence;

    invoke-virtual {v7, v1}, Lmx;->a(Ljava/lang/CharSequence;)V

    .line 8683
    :cond_9
    iget-object v1, v6, Lmz;->c:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_1

    .line 8684
    iget-object v1, v6, Lmz;->c:Landroid/graphics/drawable/Drawable;

    .line 9356
    iput-object v1, v7, Lmx;->y:Landroid/graphics/drawable/Drawable;

    .line 9357
    iput v0, v7, Lmx;->x:I

    .line 9359
    iget-object v0, v7, Lmx;->z:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    .line 9360
    if-eqz v1, :cond_a

    .line 9361
    iget-object v0, v7, Lmx;->z:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_2

    .line 9363
    :cond_a
    iget-object v0, v7, Lmx;->z:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_2

    .line 9785
    :cond_b
    new-instance v1, Lnc;

    iget-object v9, v6, Lmz;->a:Landroid/content/Context;

    const v10, 0x1020014

    invoke-direct {v1, v9, v8, v10, v11}, Lnc;-><init>(Landroid/content/Context;II[Ljava/lang/CharSequence;)V

    goto/16 :goto_3
.end method

.method public final b()Landroid/widget/ListAdapter;
    .locals 1

    .prologue
    .line 121
    iget-object v0, p0, Lpy;->h:Lpz;

    if-nez v0, :cond_0

    .line 122
    new-instance v0, Lpz;

    invoke-direct {v0, p0}, Lpz;-><init>(Lpy;)V

    iput-object v0, p0, Lpy;->h:Lpz;

    .line 124
    :cond_0
    iget-object v0, p0, Lpy;->h:Lpz;

    return-object v0
.end method

.method public final b(Z)V
    .locals 1

    .prologue
    .line 129
    iget-object v0, p0, Lpy;->h:Lpz;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lpy;->h:Lpz;

    invoke-virtual {v0}, Lpz;->notifyDataSetChanged()V

    .line 130
    :cond_0
    return-void
.end method

.method public final b(Lqe;)Z
    .locals 1

    .prologue
    .line 178
    const/4 v0, 0x0

    return v0
.end method

.method public final c(Lqe;)Z
    .locals 1

    .prologue
    .line 182
    const/4 v0, 0x0

    return v0
.end method

.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 3

    .prologue
    .line 169
    iget-object v0, p0, Lpy;->b:Lqa;

    iget-object v1, p0, Lpy;->h:Lpz;

    invoke-virtual {v1, p3}, Lpz;->a(I)Lqe;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, v2}, Lqa;->a(Landroid/view/MenuItem;Lqp;I)Z

    .line 170
    return-void
.end method
