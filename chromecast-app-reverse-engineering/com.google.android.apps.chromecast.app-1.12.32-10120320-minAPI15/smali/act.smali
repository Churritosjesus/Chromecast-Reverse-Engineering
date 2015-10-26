.class final Lact;
.super Landroid/os/AsyncTask;
.source "PG"


# instance fields
.field final synthetic a:Lacb;


# direct methods
.method constructor <init>(Lacb;)V
    .locals 0

    .prologue
    .line 2726
    iput-object p1, p0, Lact;->a:Lacb;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method static synthetic a(Lact;Lacx;)Lada;
    .locals 1

    .prologue
    .line 2726
    invoke-direct {p0, p1}, Lact;->a(Lacx;)Lada;

    move-result-object v0

    return-object v0
.end method

.method private a(Lacx;)Lada;
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 2729
    :try_start_0
    iget-object v1, p0, Lact;->a:Lacb;

    invoke-static {v1}, Lacb;->s(Lacb;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2735
    :goto_0
    return-object v0

    .line 2732
    :cond_0
    iget-object v1, p0, Lact;->a:Lacb;

    invoke-static {v1, p1}, Lacb;->a(Lacb;Lacx;)Lada;
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 2733
    :catch_0
    move-exception v1

    .line 2734
    const-string v2, "RecipientEditTextView"

    invoke-virtual {v1}, Ljava/lang/NullPointerException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method static synthetic a(Lact;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    .prologue
    .line 2726
    invoke-direct {p0, p1, p2}, Lact;->a(Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method private a(Ljava/util/List;Ljava/util/List;)V
    .locals 3

    .prologue
    .line 2840
    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 2841
    new-instance v0, Lacv;

    invoke-direct {v0, p0, p1, p2}, Lacv;-><init>(Lact;Ljava/util/List;Ljava/util/List;)V

    .line 2889
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    if-ne v1, v2, :cond_1

    .line 2890
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 2895
    :cond_0
    :goto_0
    return-void

    .line 2892
    :cond_1
    iget-object v1, p0, Lact;->a:Lacb;

    invoke-static {v1}, Lacb;->e(Lacb;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    .line 2726
    .line 3768
    iget-object v0, p0, Lact;->a:Lacb;

    invoke-static {v0}, Lacb;->u(Lacb;)Lacp;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3769
    iget-object v0, p0, Lact;->a:Lacb;

    invoke-static {v0}, Lacb;->u(Lacb;)Lacp;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lacp;->cancel(Z)Z

    .line 3774
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 3776
    iget-object v0, p0, Lact;->a:Lacb;

    invoke-virtual {v0}, Lacb;->e()[Lada;

    move-result-object v0

    .line 3777
    invoke-static {v1, v0}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 3778
    iget-object v0, p0, Lact;->a:Lacb;

    invoke-static {v0}, Lacb;->t(Lacb;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 3779
    iget-object v0, p0, Lact;->a:Lacb;

    invoke-static {v0}, Lacb;->t(Lacb;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 3781
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 3782
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lada;

    .line 3783
    if-eqz v0, :cond_2

    .line 3784
    iget-object v4, p0, Lact;->a:Lacb;

    invoke-interface {v0}, Lada;->g()Lacx;

    move-result-object v0

    invoke-virtual {v4, v0}, Lacb;->a(Lacx;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 3787
    :cond_3
    iget-object v0, p0, Lact;->a:Lacb;

    invoke-virtual {v0}, Lacb;->g()Laav;

    move-result-object v0

    .line 3788
    new-instance v3, Lacu;

    invoke-direct {v3, p0, v1}, Lacu;-><init>(Lact;Ljava/util/ArrayList;)V

    invoke-virtual {v0, v2, v3}, Laav;->a(Ljava/util/ArrayList;Laca;)V

    .line 3835
    const/4 v0, 0x0

    .line 2726
    return-object v0
.end method

.method protected final onPreExecute()V
    .locals 6

    .prologue
    .line 2743
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 2745
    iget-object v0, p0, Lact;->a:Lacb;

    invoke-virtual {v0}, Lacb;->e()[Lada;

    move-result-object v0

    .line 2746
    invoke-static {v1, v0}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 2747
    iget-object v0, p0, Lact;->a:Lacb;

    invoke-static {v0}, Lacb;->t(Lacb;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2748
    iget-object v0, p0, Lact;->a:Lacb;

    invoke-static {v0}, Lacb;->t(Lacb;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 2751
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    .line 2752
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 2754
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lada;

    .line 2755
    invoke-interface {v0}, Lada;->g()Lacx;

    move-result-object v4

    .line 3247
    iget-wide v4, v4, Lacx;->g:J

    .line 2755
    invoke-static {v4, v5}, Lacx;->a(J)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, p0, Lact;->a:Lacb;

    .line 3626
    invoke-virtual {v4}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v4

    .line 2756
    invoke-interface {v4, v0}, Landroid/text/Spannable;->getSpanStart(Ljava/lang/Object;)I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_1

    .line 2757
    invoke-interface {v0}, Lada;->g()Lacx;

    move-result-object v0

    invoke-direct {p0, v0}, Lact;->a(Lacx;)Lada;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 2759
    :cond_1
    const/4 v0, 0x0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 2763
    :cond_2
    invoke-direct {p0, v1, v2}, Lact;->a(Ljava/util/List;Ljava/util/List;)V

    .line 2764
    return-void
.end method
