.class public final Lzl;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;

.field final d:Ljava/util/List;

.field public final synthetic e:Landroid/support/v7/widget/RecyclerView;

.field private f:I

.field private g:Lzk;


# direct methods
.method public constructor <init>(Landroid/support/v7/widget/RecyclerView;)V
    .locals 1

    .prologue
    .line 4151
    iput-object p1, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4152
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lzl;->a:Ljava/util/ArrayList;

    .line 4153
    const/4 v0, 0x0

    iput-object v0, p0, Lzl;->b:Ljava/util/ArrayList;

    .line 4155
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lzl;->c:Ljava/util/ArrayList;

    .line 4157
    iget-object v0, p0, Lzl;->a:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lzl;->d:Ljava/util/List;

    .line 4160
    const/4 v0, 0x2

    iput v0, p0, Lzl;->f:I

    return-void
.end method

.method private a(IIZ)Lzr;
    .locals 8

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 4741
    iget-object v0, p0, Lzl;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    move v3, v2

    .line 4744
    :goto_0
    if-ge v3, v4, :cond_3

    .line 4745
    iget-object v0, p0, Lzl;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzr;

    .line 4746
    invoke-virtual {v0}, Lzr;->g()Z

    move-result v5

    if-nez v5, :cond_2

    invoke-virtual {v0}, Lzr;->d()I

    move-result v5

    if-ne v5, p1, :cond_2

    invoke-virtual {v0}, Lzr;->j()Z

    move-result v5

    if-nez v5, :cond_2

    iget-object v5, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v5, v5, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    .line 25040
    iget-boolean v5, v5, Lzp;->j:Z

    .line 4746
    if-nez v5, :cond_0

    invoke-virtual {v0}, Lzr;->n()Z

    move-result v5

    if-nez v5, :cond_2

    .line 4754
    :cond_0
    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Lzr;->a(I)V

    .line 4784
    :cond_1
    :goto_1
    return-object v0

    .line 4744
    :cond_2
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    .line 4759
    :cond_3
    if-nez p3, :cond_4

    .line 4760
    iget-object v0, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v4, v0, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    .line 25180
    iget-object v0, v4, Lxb;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    move v3, v2

    .line 25181
    :goto_2
    if-ge v3, v5, :cond_6

    .line 25182
    iget-object v0, v4, Lxb;->c:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 25183
    iget-object v6, v4, Lxb;->a:Lxd;

    invoke-interface {v6, v0}, Lxd;->b(Landroid/view/View;)Lzr;

    move-result-object v6

    .line 25184
    invoke-virtual {v6}, Lzr;->d()I

    move-result v7

    if-ne v7, p1, :cond_5

    invoke-virtual {v6}, Lzr;->j()Z

    move-result v6

    if-nez v6, :cond_5

    .line 4761
    :goto_3
    if-eqz v0, :cond_4

    .line 4763
    iget-object v3, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v3, v3, Landroid/support/v7/widget/RecyclerView;->m:Lzc;

    iget-object v4, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v4, v0}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/view/View;)Lzr;

    move-result-object v0

    invoke-virtual {v3, v0}, Lzc;->c(Lzr;)V

    .line 4768
    :cond_4
    iget-object v0, p0, Lzl;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 4769
    :goto_4
    if-ge v2, v3, :cond_8

    .line 4770
    iget-object v0, p0, Lzl;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzr;

    .line 4773
    invoke-virtual {v0}, Lzr;->j()Z

    move-result v4

    if-nez v4, :cond_7

    invoke-virtual {v0}, Lzr;->d()I

    move-result v4

    if-ne v4, p1, :cond_7

    .line 4774
    if-nez p3, :cond_1

    .line 4775
    iget-object v1, p0, Lzl;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_1

    .line 25181
    :cond_5
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_2

    :cond_6
    move-object v0, v1

    .line 25189
    goto :goto_3

    .line 4769
    :cond_7
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_4

    :cond_8
    move-object v0, v1

    .line 4784
    goto :goto_1
.end method

.method private a(Landroid/view/ViewGroup;Z)V
    .locals 4

    .prologue
    const/4 v3, 0x4

    .line 4478
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_1

    .line 4479
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 4480
    instance-of v2, v0, Landroid/view/ViewGroup;

    if-eqz v2, :cond_0

    .line 4481
    check-cast v0, Landroid/view/ViewGroup;

    const/4 v2, 0x1

    invoke-direct {p0, v0, v2}, Lzl;->a(Landroid/view/ViewGroup;Z)V

    .line 4478
    :cond_0
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    .line 4484
    :cond_1
    if-nez p2, :cond_2

    .line 4496
    :goto_1
    return-void

    .line 4488
    :cond_2
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v0

    if-ne v0, v3, :cond_3

    .line 4489
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 4490
    invoke-virtual {p1, v3}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto :goto_1

    .line 4492
    :cond_3
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v0

    .line 4493
    invoke-virtual {p1, v3}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 4494
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto :goto_1
.end method

.method private c(I)Lzr;
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 4703
    iget-object v0, p0, Lzl;->b:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzl;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-nez v3, :cond_1

    :cond_0
    move-object v0, v1

    .line 4728
    :goto_0
    return-object v0

    .line 4707
    :cond_1
    const/4 v0, 0x0

    move v2, v0

    :goto_1
    if-ge v2, v3, :cond_3

    .line 4708
    iget-object v0, p0, Lzl;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzr;

    .line 4709
    invoke-virtual {v0}, Lzr;->g()Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {v0}, Lzr;->d()I

    move-result v4

    if-ne v4, p1, :cond_2

    .line 4710
    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Lzr;->a(I)V

    goto :goto_0

    .line 4707
    :cond_2
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    .line 4715
    :cond_3
    iget-object v0, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->f(Landroid/support/v7/widget/RecyclerView;)Lyz;

    move-object v0, v1

    .line 4728
    goto :goto_0
.end method

.method private c(Lzr;)V
    .locals 5

    .prologue
    .line 4627
    iget-object v0, p1, Lzr;->a:Landroid/view/View;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lgt;->a(Landroid/view/View;Ler;)V

    .line 19838
    iget-object v0, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->s(Landroid/support/v7/widget/RecyclerView;)Ls;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 19839
    iget-object v0, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->s(Landroid/support/v7/widget/RecyclerView;)Ls;

    .line 19841
    :cond_0
    iget-object v0, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->f(Landroid/support/v7/widget/RecyclerView;)Lyz;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 19842
    iget-object v0, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->f(Landroid/support/v7/widget/RecyclerView;)Lyz;

    .line 19844
    :cond_1
    iget-object v0, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    if-eqz v0, :cond_2

    .line 19845
    iget-object v0, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    invoke-virtual {v0, p1}, Lzp;->a(Lzr;)V

    .line 4630
    :cond_2
    invoke-virtual {p0}, Lzl;->c()Lzk;

    move-result-object v1

    .line 20170
    iget v2, p1, Lzr;->e:I

    .line 21126
    iget-object v0, v1, Lzk;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 21127
    if-nez v0, :cond_3

    .line 21128
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21129
    iget-object v3, v1, Lzk;->a:Landroid/util/SparseArray;

    invoke-virtual {v3, v2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 21130
    iget-object v3, v1, Lzk;->b:Landroid/util/SparseIntArray;

    invoke-virtual {v3, v2}, Landroid/util/SparseIntArray;->indexOfKey(I)I

    move-result v3

    if-gez v3, :cond_3

    .line 21131
    iget-object v3, v1, Lzk;->b:Landroid/util/SparseIntArray;

    const/4 v4, 0x5

    invoke-virtual {v3, v2, v4}, Landroid/util/SparseIntArray;->put(II)V

    .line 20082
    :cond_3
    iget-object v1, v1, Lzk;->b:Landroid/util/SparseIntArray;

    invoke-virtual {v1, v2}, Landroid/util/SparseIntArray;->get(I)I

    move-result v1

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-le v1, v2, :cond_4

    .line 20088
    invoke-virtual {p1}, Lzr;->p()V

    .line 20089
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4631
    :cond_4
    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 3

    .prologue
    .line 4301
    if-ltz p1, :cond_0

    iget-object v0, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    invoke-virtual {v0}, Lzp;->a()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 4302
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "invalid position "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ". State item count is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v2, v2, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    invoke-virtual {v2}, Lzp;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 4305
    :cond_1
    iget-object v0, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    .line 10090
    iget-boolean v0, v0, Lzp;->j:Z

    .line 4305
    if-nez v0, :cond_2

    .line 4308
    :goto_0
    return p1

    :cond_2
    iget-object v0, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->b:Lwh;

    invoke-virtual {v0, p1}, Lwh;->a(I)I

    move-result p1

    goto :goto_0
.end method

.method final a(IZ)Landroid/view/View;
    .locals 8

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 4330
    if-ltz p1, :cond_0

    iget-object v0, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    invoke-virtual {v0}, Lzp;->a()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 4331
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid item position "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "). Item count:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v2, v2, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    invoke-virtual {v2}, Lzp;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 4337
    :cond_1
    iget-object v0, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    .line 11090
    iget-boolean v0, v0, Lzp;->j:Z

    .line 4337
    if-eqz v0, :cond_1a

    .line 4338
    invoke-direct {p0, p1}, Lzl;->c(I)Lzr;

    move-result-object v4

    .line 4339
    if-eqz v4, :cond_3

    move v0, v2

    :goto_0
    move-object v7, v4

    move v4, v0

    move-object v0, v7

    .line 4342
    :goto_1
    if-nez v0, :cond_19

    .line 4343
    const/4 v0, -0x1

    invoke-direct {p0, p1, v0, v3}, Lzl;->a(IIZ)Lzr;

    move-result-object v0

    .line 4344
    if-eqz v0, :cond_19

    .line 11210
    invoke-virtual {v0}, Lzr;->n()Z

    move-result v5

    if-nez v5, :cond_8

    .line 11213
    iget v5, v0, Lzr;->b:I

    if-ltz v5, :cond_2

    iget v5, v0, Lzr;->b:I

    iget-object v6, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v6}, Landroid/support/v7/widget/RecyclerView;->f(Landroid/support/v7/widget/RecyclerView;)Lyz;

    move-result-object v6

    invoke-virtual {v6}, Lyz;->a()I

    move-result v6

    if-lt v5, v6, :cond_4

    .line 11214
    :cond_2
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Inconsistency detected. Invalid view holder adapter position"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    move v0, v3

    .line 4339
    goto :goto_0

    .line 11217
    :cond_4
    iget-object v5, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v5, v5, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    .line 12090
    iget-boolean v5, v5, Lzp;->j:Z

    .line 11217
    if-nez v5, :cond_7

    .line 11219
    iget-object v5, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v5}, Landroid/support/v7/widget/RecyclerView;->f(Landroid/support/v7/widget/RecyclerView;)Lyz;

    move-result-object v5

    iget v6, v0, Lzr;->b:I

    invoke-virtual {v5, v6}, Lyz;->a(I)I

    move-result v5

    .line 12170
    iget v6, v0, Lzr;->e:I

    .line 11220
    if-eq v5, v6, :cond_7

    move v5, v3

    .line 4345
    :goto_2
    if-nez v5, :cond_a

    .line 4350
    const/4 v5, 0x4

    invoke-virtual {v0, v5}, Lzr;->a(I)V

    .line 4351
    invoke-virtual {v0}, Lzr;->e()Z

    move-result v5

    if-eqz v5, :cond_9

    .line 4352
    iget-object v5, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v6, v0, Lzr;->a:Landroid/view/View;

    invoke-virtual {v5, v6, v3}, Landroid/support/v7/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 4353
    invoke-virtual {v0}, Lzr;->f()V

    .line 4357
    :cond_5
    :goto_3
    invoke-virtual {p0, v0}, Lzl;->a(Lzr;)V

    move-object v0, v1

    move v5, v4

    .line 4365
    :goto_4
    if-nez v0, :cond_18

    .line 4366
    iget-object v4, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v4, v4, Landroid/support/v7/widget/RecyclerView;->b:Lwh;

    invoke-virtual {v4, p1}, Lwh;->a(I)I

    move-result v4

    .line 4367
    if-ltz v4, :cond_6

    iget-object v6, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v6}, Landroid/support/v7/widget/RecyclerView;->f(Landroid/support/v7/widget/RecyclerView;)Lyz;

    move-result-object v6

    invoke-virtual {v6}, Lyz;->a()I

    move-result v6

    if-lt v4, v6, :cond_b

    .line 4368
    :cond_6
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Inconsistency detected. Invalid item position "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "(offset:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ").state:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v2, v2, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    invoke-virtual {v2}, Lzp;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 11224
    :cond_7
    iget-object v5, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v5}, Landroid/support/v7/widget/RecyclerView;->f(Landroid/support/v7/widget/RecyclerView;)Lyz;

    :cond_8
    move v5, v2

    .line 11227
    goto :goto_2

    .line 4354
    :cond_9
    invoke-virtual {v0}, Lzr;->g()Z

    move-result v5

    if-eqz v5, :cond_5

    .line 4355
    invoke-virtual {v0}, Lzr;->h()V

    goto :goto_3

    :cond_a
    move v5, v2

    .line 4361
    goto :goto_4

    .line 4373
    :cond_b
    iget-object v6, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v6}, Landroid/support/v7/widget/RecyclerView;->f(Landroid/support/v7/widget/RecyclerView;)Lyz;

    move-result-object v6

    invoke-virtual {v6, v4}, Lyz;->a(I)I

    move-result v4

    .line 4375
    iget-object v6, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v6}, Landroid/support/v7/widget/RecyclerView;->f(Landroid/support/v7/widget/RecyclerView;)Lyz;

    .line 4400
    if-nez v0, :cond_e

    .line 4407
    invoke-virtual {p0}, Lzl;->c()Lzk;

    move-result-object v0

    .line 14058
    iget-object v0, v0, Lzk;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 14059
    if-eqz v0, :cond_c

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_c

    .line 14060
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v6, v1, -0x1

    .line 14061
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzr;

    .line 14062
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 4408
    :cond_c
    if-eqz v1, :cond_d

    .line 4409
    invoke-virtual {v1}, Lzr;->p()V

    .line 4410
    invoke-static {}, Landroid/support/v7/widget/RecyclerView;->j()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 14472
    iget-object v0, v1, Lzr;->a:Landroid/view/View;

    instance-of v0, v0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_d

    .line 14473
    iget-object v0, v1, Lzr;->a:Landroid/view/View;

    check-cast v0, Landroid/view/ViewGroup;

    invoke-direct {p0, v0, v3}, Lzl;->a(Landroid/view/ViewGroup;Z)V

    :cond_d
    move-object v0, v1

    .line 4415
    :cond_e
    if-nez v0, :cond_18

    .line 4416
    iget-object v0, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->f(Landroid/support/v7/widget/RecyclerView;)Lyz;

    move-result-object v0

    iget-object v1, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    .line 15115
    const-string v6, "RV CreateView"

    invoke-static {v6}, La;->a(Ljava/lang/String;)V

    .line 15116
    invoke-virtual {v0, v1, v4}, Lyz;->a(Landroid/view/ViewGroup;I)Lzr;

    move-result-object v0

    .line 15117
    iput v4, v0, Lzr;->e:I

    .line 15118
    invoke-static {}, La;->b()V

    move-object v1, v0

    .line 4423
    :goto_5
    iget-object v0, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    .line 16090
    iget-boolean v0, v0, Lzp;->j:Z

    .line 4423
    if-eqz v0, :cond_f

    invoke-virtual {v1}, Lzr;->m()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 4425
    iput p1, v1, Lzr;->f:I

    move v4, v3

    .line 4441
    :goto_6
    iget-object v0, v1, Lzr;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 4443
    if-nez v0, :cond_14

    .line 4444
    iget-object v0, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lzi;

    .line 4445
    iget-object v6, v1, Lzr;->a:Landroid/view/View;

    invoke-virtual {v6, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 4452
    :goto_7
    iput-object v1, v0, Lzi;->c:Lzr;

    .line 4453
    if-eqz v5, :cond_16

    if-eqz v4, :cond_16

    :goto_8
    iput-boolean v2, v0, Lzi;->f:Z

    .line 4454
    iget-object v0, v1, Lzr;->a:Landroid/view/View;

    return-object v0

    .line 4426
    :cond_f
    invoke-virtual {v1}, Lzr;->m()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual {v1}, Lzr;->k()Z

    move-result v0

    if-nez v0, :cond_10

    invoke-virtual {v1}, Lzr;->j()Z

    move-result v0

    if-eqz v0, :cond_17

    .line 4431
    :cond_10
    iget-object v0, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->b:Lwh;

    invoke-virtual {v0, p1}, Lwh;->a(I)I

    move-result v0

    .line 4433
    iget-object v4, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v4}, Landroid/support/v7/widget/RecyclerView;->f(Landroid/support/v7/widget/RecyclerView;)Lyz;

    move-result-object v4

    invoke-virtual {v4, v1, v0}, Lyz;->b(Lzr;I)V

    .line 4434
    iget-object v0, v1, Lzr;->a:Landroid/view/View;

    .line 16458
    iget-object v4, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v4}, Landroid/support/v7/widget/RecyclerView;->q(Landroid/support/v7/widget/RecyclerView;)Landroid/view/accessibility/AccessibilityManager;

    move-result-object v4

    if-eqz v4, :cond_12

    iget-object v4, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v4}, Landroid/support/v7/widget/RecyclerView;->q(Landroid/support/v7/widget/RecyclerView;)Landroid/view/accessibility/AccessibilityManager;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v4

    if-eqz v4, :cond_12

    .line 16459
    invoke-static {v0}, Lgt;->e(Landroid/view/View;)I

    move-result v4

    if-nez v4, :cond_11

    .line 16461
    invoke-static {v0, v2}, Lgt;->c(Landroid/view/View;I)V

    .line 16464
    :cond_11
    invoke-static {v0}, Lgt;->b(Landroid/view/View;)Z

    move-result v4

    if-nez v4, :cond_12

    .line 16465
    iget-object v4, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v4}, Landroid/support/v7/widget/RecyclerView;->r(Landroid/support/v7/widget/RecyclerView;)Lzs;

    move-result-object v4

    .line 17076
    iget-object v4, v4, Lzs;->c:Ler;

    .line 16465
    invoke-static {v0, v4}, Lgt;->a(Landroid/view/View;Ler;)V

    .line 4436
    :cond_12
    iget-object v0, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    .line 17090
    iget-boolean v0, v0, Lzp;->j:Z

    .line 4436
    if-eqz v0, :cond_13

    .line 4437
    iput p1, v1, Lzr;->f:I

    :cond_13
    move v4, v2

    goto :goto_6

    .line 4446
    :cond_14
    iget-object v6, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v6, v0}, Landroid/support/v7/widget/RecyclerView;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    move-result v6

    if-nez v6, :cond_15

    .line 4447
    iget-object v6, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v6, v0}, Landroid/support/v7/widget/RecyclerView;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lzi;

    .line 4448
    iget-object v6, v1, Lzr;->a:Landroid/view/View;

    invoke-virtual {v6, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_7

    .line 4450
    :cond_15
    check-cast v0, Lzi;

    goto/16 :goto_7

    :cond_16
    move v2, v3

    .line 4453
    goto :goto_8

    :cond_17
    move v4, v3

    goto/16 :goto_6

    :cond_18
    move-object v1, v0

    goto/16 :goto_5

    :cond_19
    move v5, v4

    goto/16 :goto_4

    :cond_1a
    move-object v0, v1

    move v4, v3

    goto/16 :goto_1
.end method

.method public final a()V
    .locals 1

    .prologue
    .line 4173
    iget-object v0, p0, Lzl;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4174
    invoke-virtual {p0}, Lzl;->b()V

    .line 4175
    return-void
.end method

.method public final a(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 4511
    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Lzr;

    move-result-object v0

    .line 4512
    invoke-virtual {v0}, Lzr;->o()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4513
    iget-object v1, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v2}, Landroid/support/v7/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 4515
    :cond_0
    invoke-virtual {v0}, Lzr;->e()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 4516
    invoke-virtual {v0}, Lzr;->f()V

    .line 4520
    :cond_1
    :goto_0
    invoke-virtual {p0, v0}, Lzl;->a(Lzr;)V

    .line 4521
    return-void

    .line 4517
    :cond_2
    invoke-virtual {v0}, Lzr;->g()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 4518
    invoke-virtual {v0}, Lzr;->h()V

    goto :goto_0
.end method

.method public final a(Lzr;)V
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 4569
    invoke-virtual {p1}, Lzr;->e()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p1, Lzr;->a:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 4570
    :cond_0
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Scrapped or attached views may not be recycled. isScrap:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lzr;->e()Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " isAttached:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p1, Lzr;->a:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    if-eqz v4, :cond_1

    :goto_0
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_1
    move v0, v1

    goto :goto_0

    .line 4576
    :cond_2
    invoke-virtual {p1}, Lzr;->o()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 4577
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Tmp detached view should be removed from RecyclerView before it can be recycled: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 4581
    :cond_3
    invoke-virtual {p1}, Lzr;->b()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 4582
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 18327
    :cond_4
    iget v2, p1, Lzr;->i:I

    and-int/lit8 v2, v2, 0x10

    if-nez v2, :cond_9

    iget-object v2, p1, Lzr;->a:Landroid/view/View;

    invoke-static {v2}, Lgt;->c(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_9

    move v2, v0

    .line 4588
    :goto_1
    iget-object v3, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v3}, Landroid/support/v7/widget/RecyclerView;->f(Landroid/support/v7/widget/RecyclerView;)Lyz;

    move-result-object v3

    if-eqz v3, :cond_5

    if-eqz v2, :cond_5

    iget-object v2, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v2}, Landroid/support/v7/widget/RecyclerView;->f(Landroid/support/v7/widget/RecyclerView;)Lyz;

    .line 4597
    :cond_5
    invoke-virtual {p1}, Lzr;->q()Z

    move-result v2

    if-eqz v2, :cond_8

    .line 19222
    iget v2, p1, Lzr;->i:I

    and-int/lit8 v2, v2, 0x4e

    if-eqz v2, :cond_a

    move v2, v0

    .line 4598
    :goto_2
    if-nez v2, :cond_7

    .line 4601
    iget-object v2, p0, Lzl;->c:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 4602
    iget v3, p0, Lzl;->f:I

    if-ne v2, v3, :cond_6

    if-lez v2, :cond_6

    .line 4603
    invoke-virtual {p0, v1}, Lzl;->b(I)V

    .line 4605
    :cond_6
    iget v3, p0, Lzl;->f:I

    if-ge v2, v3, :cond_7

    .line 4606
    iget-object v1, p0, Lzl;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v1, v0

    .line 4610
    :cond_7
    if-nez v1, :cond_8

    .line 4611
    invoke-direct {p0, p1}, Lzl;->c(Lzr;)V

    .line 4620
    :cond_8
    iget-object v0, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    invoke-virtual {v0, p1}, Lzp;->a(Lzr;)V

    .line 4624
    return-void

    :cond_9
    move v2, v1

    .line 18327
    goto :goto_1

    :cond_a
    move v2, v1

    .line 19222
    goto :goto_2
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 4533
    iget-object v0, p0, Lzl;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 4534
    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    .line 4535
    invoke-virtual {p0, v0}, Lzl;->b(I)V

    .line 4534
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 4537
    :cond_0
    iget-object v0, p0, Lzl;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4538
    return-void
.end method

.method public final b(I)V
    .locals 1

    .prologue
    .line 4555
    iget-object v0, p0, Lzl;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzr;

    .line 4559
    invoke-direct {p0, v0}, Lzl;->c(Lzr;)V

    .line 4560
    iget-object v0, p0, Lzl;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 4561
    return-void
.end method

.method final b(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 4639
    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Lzr;

    move-result-object v0

    .line 21935
    const/4 v1, 0x0

    iput-object v1, v0, Lzr;->j:Lzl;

    .line 4641
    invoke-virtual {v0}, Lzr;->h()V

    .line 4642
    invoke-virtual {p0, v0}, Lzl;->a(Lzr;)V

    .line 4643
    return-void
.end method

.method public final b(Lzr;)V
    .locals 1

    .prologue
    .line 4679
    invoke-virtual {p1}, Lzr;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->h(Landroid/support/v7/widget/RecyclerView;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzl;->b:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    .line 4680
    :cond_0
    iget-object v0, p0, Lzl;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 22935
    :goto_0
    const/4 v0, 0x0

    iput-object v0, p1, Lzr;->j:Lzl;

    .line 4685
    invoke-virtual {p1}, Lzr;->h()V

    .line 4686
    return-void

    .line 4682
    :cond_1
    iget-object v0, p0, Lzl;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public final c()Lzk;
    .locals 1

    .prologue
    .line 4942
    iget-object v0, p0, Lzl;->g:Lzk;

    if-nez v0, :cond_0

    .line 4943
    new-instance v0, Lzk;

    invoke-direct {v0}, Lzk;-><init>()V

    iput-object v0, p0, Lzl;->g:Lzk;

    .line 4945
    :cond_0
    iget-object v0, p0, Lzl;->g:Lzk;

    return-object v0
.end method
