.class public final Lalm;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field public final a:Lbkl;

.field public final b:Landroid/content/SharedPreferences;

.field public final c:Lass;

.field d:Lbmu;

.field final e:Ljava/util/List;

.field public final f:Ljava/util/List;

.field public final g:Ljava/util/List;

.field public final h:Ljava/util/List;

.field public final i:Ljava/util/HashSet;

.field final j:Ljava/util/Set;

.field final k:Ljava/util/Set;

.field final l:Ljava/util/Set;

.field final m:Ljava/util/List;

.field private final n:Lals;

.field private final o:Ljava/lang/String;

.field private final p:Lblp;

.field private q:Ljava/lang/String;

.field private r:Ljava/util/List;

.field private final s:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public constructor <init>(Lbkl;Landroid/content/SharedPreferences;)V
    .locals 3

    .prologue
    .line 153
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 96
    new-instance v0, Laln;

    invoke-direct {v0, p0}, Laln;-><init>(Lalm;)V

    iput-object v0, p0, Lalm;->n:Lals;

    .line 113
    new-instance v0, Lblp;

    const-string v1, "DeviceManager"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lalm;->p:Lblp;

    .line 117
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lalm;->e:Ljava/util/List;

    .line 119
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lalm;->f:Ljava/util/List;

    .line 128
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 129
    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lalm;->g:Ljava/util/List;

    .line 130
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 131
    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lalm;->h:Ljava/util/List;

    .line 135
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 136
    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lalm;->j:Ljava/util/Set;

    .line 137
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 138
    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lalm;->k:Ljava/util/Set;

    .line 139
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 140
    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lalm;->l:Ljava/util/Set;

    .line 144
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 145
    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lalm;->m:Ljava/util/List;

    .line 154
    iput-object p1, p0, Lalm;->a:Lbkl;

    .line 155
    iput-object p2, p0, Lalm;->b:Landroid/content/SharedPreferences;

    .line 157
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    invoke-static {v0}, Lblf;->I(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lalm;->o:Ljava/lang/String;

    .line 158
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    .line 5439
    iget-object v0, v0, Lcom/google/android/apps/chromecast/app/SetupApplication;->j:Lass;

    .line 158
    iput-object v0, p0, Lalm;->c:Lass;

    .line 159
    iget-object v0, p0, Lalm;->b:Landroid/content/SharedPreferences;

    const-string v1, "hiddenDevices"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 160
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, Lalm;->i:Ljava/util/HashSet;

    .line 161
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 162
    iget-object v1, p0, Lalm;->i:Ljava/util/HashSet;

    const-string v2, ","

    invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->addAll(Ljava/util/Collection;)Z

    .line 164
    :cond_0
    const/4 v0, 0x4

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lalm;->s:Ljava/util/concurrent/ExecutorService;

    .line 165
    return-void
.end method

.method private a(II)Z
    .locals 8

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 875
    sget v0, Lalr;->a:I

    if-ne p2, v0, :cond_1

    .line 876
    iget-object v0, p0, Lalm;->g:Ljava/util/List;

    move-object v1, v0

    .line 883
    :goto_0
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laow;

    .line 38156
    sget v4, Laoz;->a:I

    invoke-virtual {v0, v4}, Laow;->c(I)Z

    .line 38157
    sget v4, Laoz;->b:I

    invoke-virtual {v0, v4}, Laow;->c(I)Z

    .line 38158
    sget v4, Laoz;->c:I

    invoke-virtual {v0, v4}, Laow;->c(I)Z

    .line 38690
    sget v4, Laoz;->a:I

    invoke-virtual {v0, v4}, Laow;->d(I)Z

    move-result v4

    if-nez v4, :cond_0

    sget v4, Laoz;->d:I

    .line 38691
    invoke-virtual {v0, v4}, Laow;->d(I)Z

    move-result v4

    if-nez v4, :cond_0

    sget v4, Laoz;->c:I

    .line 38692
    invoke-virtual {v0, v4}, Laow;->d(I)Z

    move-result v4

    if-nez v4, :cond_0

    sget v4, Laoz;->b:I

    .line 38693
    invoke-virtual {v0, v4}, Laow;->d(I)Z

    move-result v4

    if-eqz v4, :cond_3

    :cond_0
    move v4, v3

    .line 885
    :goto_1
    if-eqz v4, :cond_4

    move v0, v2

    .line 899
    :goto_2
    return v0

    .line 877
    :cond_1
    sget v0, Lalr;->b:I

    if-ne p2, v0, :cond_2

    .line 878
    iget-object v0, p0, Lalm;->h:Ljava/util/List;

    move-object v1, v0

    goto :goto_0

    .line 880
    :cond_2
    iget-object v0, p0, Lalm;->p:Lblp;

    const-string v1, "purgeStaleDevice: Unknown device list type passed in"

    new-array v3, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v3}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    move v0, v2

    .line 881
    goto :goto_2

    :cond_3
    move v4, v2

    .line 38693
    goto :goto_1

    .line 888
    :cond_4
    invoke-virtual {p0, p1, v1}, Lalm;->a(ILjava/util/List;)V

    .line 889
    iget-object v4, p0, Lalm;->d:Lbmu;

    if-eqz v4, :cond_5

    .line 890
    iget-object v4, p0, Lalm;->g:Ljava/util/List;

    if-ne v1, v4, :cond_6

    .line 891
    iget-object v1, p0, Lalm;->d:Lbmu;

    invoke-virtual {v1, p1}, Lbmu;->g(I)V

    .line 896
    :cond_5
    :goto_3
    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    .line 39597
    iget-object v4, v0, Laow;->c:Lbdf;

    .line 40254
    iget-object v4, v4, Lbdf;->b:Ljava/lang/String;

    .line 897
    aput-object v4, v1, v2

    invoke-virtual {v0}, Laow;->f()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v3

    const/4 v2, 0x2

    .line 898
    invoke-static {}, Lbkl;->b()J

    move-result-wide v4

    invoke-virtual {v0}, Laow;->a()J

    move-result-wide v6

    sub-long/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    aput-object v0, v1, v2

    move v0, v3

    .line 899
    goto :goto_2

    .line 892
    :cond_6
    iget-object v4, p0, Lalm;->h:Ljava/util/List;

    if-ne v1, v4, :cond_5

    .line 893
    iget-object v1, p0, Lalm;->d:Lbmu;

    iget-object v4, p0, Lalm;->h:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v4

    invoke-virtual {v1, v4}, Lbmu;->a(Z)V

    goto :goto_3
.end method

.method private g(Ljava/lang/String;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 985
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 43511
    :cond_0
    :goto_0
    return-void

    .line 988
    :cond_1
    iget-object v0, p0, Lalm;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    .line 991
    iget-object v0, p0, Lalm;->r:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 992
    iget-object v0, p0, Lalm;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Last;

    .line 43067
    iget-object v3, v0, Last;->b:Ljava/lang/String;

    .line 993
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 994
    iget-object v2, p0, Lalm;->m:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 995
    new-array v0, v5, [Ljava/lang/Object;

    iget-object v2, p0, Lalm;->m:Ljava/util/List;

    .line 996
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v4

    .line 997
    iget-object v0, p0, Lalm;->d:Lbmu;

    if-eqz v0, :cond_0

    .line 998
    iget-object v0, p0, Lalm;->d:Lbmu;

    .line 43507
    new-array v2, v5, [Ljava/lang/Object;

    iget-object v3, v0, Lbmu;->d:Ljava/util/List;

    aput-object v3, v2, v4

    .line 43508
    if-eqz v1, :cond_3

    .line 43509
    new-array v1, v5, [Ljava/lang/Object;

    .line 43510
    invoke-virtual {v0}, Lbmu;->b()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v4

    .line 43511
    invoke-virtual {v0}, Lbmu;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Lbmu;->c(I)V

    goto :goto_0

    .line 43513
    :cond_3
    new-array v1, v5, [Ljava/lang/Object;

    .line 43514
    invoke-virtual {v0}, Lbmu;->b()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v4

    .line 43515
    invoke-virtual {v0}, Lbmu;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Lbmu;->b(I)V

    goto :goto_0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)Laow;
    .locals 3

    .prologue
    .line 757
    invoke-virtual {p0, p1}, Lalm;->e(Ljava/lang/String;)Laow;

    move-result-object v0

    .line 758
    if-nez v0, :cond_1

    .line 37742
    iget-object v0, p0, Lalm;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laow;

    .line 37743
    invoke-virtual {v0}, Laow;->n()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Laow;->n()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 761
    :cond_1
    :goto_0
    return-object v0

    .line 37747
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Z)Laow;
    .locals 3

    .prologue
    .line 765
    new-instance v1, Laow;

    iget-object v0, p0, Lalm;->a:Lbkl;

    invoke-direct {v1, v0}, Laow;-><init>(Lbkl;)V

    .line 766
    iget-object v0, p0, Lalm;->n:Lals;

    invoke-virtual {v1, v0}, Laow;->a(Lals;)V

    .line 768
    if-eqz p1, :cond_1

    iget-object v0, p0, Lalm;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 769
    :goto_0
    invoke-virtual {p0, v0, v1}, Lalm;->a(ILaow;)V

    .line 770
    iget-object v2, p0, Lalm;->d:Lbmu;

    if-eqz v2, :cond_0

    .line 771
    iget-object v2, p0, Lalm;->d:Lbmu;

    invoke-virtual {v2, v0}, Lbmu;->f(I)V

    .line 773
    :cond_0
    invoke-virtual {p0}, Lalm;->g()V

    .line 774
    return-object v1

    .line 768
    :cond_1
    invoke-virtual {p0}, Lalm;->e()I

    move-result v0

    goto :goto_0
.end method

.method a(ILaow;)V
    .locals 3

    .prologue
    .line 967
    iget-object v0, p0, Lalm;->g:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 968
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lalm;->g:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    .line 41474
    iget-object v0, p2, Laow;->j:Ljava/lang/String;

    .line 969
    invoke-virtual {p0, v0}, Lalm;->f(Ljava/lang/String;)V

    .line 970
    return-void
.end method

.method a(ILjava/util/List;)V
    .locals 4

    .prologue
    .line 977
    invoke-interface {p2, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laow;

    .line 978
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    .line 979
    if-eqz v0, :cond_0

    iget-object v1, p0, Lalm;->g:Ljava/util/List;

    if-ne p2, v1, :cond_0

    .line 42474
    iget-object v0, v0, Laow;->j:Ljava/lang/String;

    .line 980
    invoke-direct {p0, v0}, Lalm;->g(Ljava/lang/String;)V

    .line 982
    :cond_0
    return-void
.end method

.method public final a(Laow;)V
    .locals 3

    .prologue
    .line 695
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 33597
    iget-object v2, p1, Laow;->c:Lbdf;

    .line 34254
    iget-object v2, v2, Lbdf;->b:Ljava/lang/String;

    .line 695
    aput-object v2, v0, v1

    .line 696
    iget-object v0, p0, Lalm;->g:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    .line 697
    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 698
    iget-object v1, p0, Lalm;->g:Ljava/util/List;

    invoke-virtual {p0, v0, v1}, Lalm;->a(ILjava/util/List;)V

    .line 699
    iget-object v1, p0, Lalm;->d:Lbmu;

    if-eqz v1, :cond_0

    .line 700
    iget-object v1, p0, Lalm;->d:Lbmu;

    invoke-virtual {v1, v0}, Lbmu;->g(I)V

    .line 703
    :cond_0
    iget-object v0, p0, Lalm;->c:Lass;

    invoke-virtual {v0, p1}, Lass;->b(Laow;)V

    .line 704
    return-void
.end method

.method public final a(Lazf;Ljava/lang/String;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x1

    .line 195
    new-array v0, v4, [Ljava/lang/Object;

    aput-object p2, v0, v5

    .line 196
    iget-object v0, p0, Lalm;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 197
    iget-object v0, p0, Lalm;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, v4, :cond_1

    .line 199
    iget-object v0, p0, Lalm;->c:Lass;

    .line 6069
    iget-object v0, v0, Lass;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laqj;

    .line 6396
    iget-object v2, v0, Laqj;->b:Laow;

    .line 6484
    iget-boolean v2, v2, Laow;->m:Z

    .line 6070
    if-eqz v2, :cond_0

    .line 6071
    new-array v2, v4, [Ljava/lang/Object;

    .line 7396
    iget-object v0, v0, Laqj;->b:Laow;

    .line 7597
    iget-object v0, v0, Laow;->c:Lbdf;

    .line 8254
    iget-object v0, v0, Lbdf;->b:Ljava/lang/String;

    .line 6071
    aput-object v0, v2, v5

    goto :goto_0

    .line 6074
    :cond_0
    new-array v2, v4, [Ljava/lang/Object;

    .line 8396
    iget-object v3, v0, Laqj;->b:Laow;

    .line 8597
    iget-object v3, v3, Laow;->c:Lbdf;

    .line 9254
    iget-object v3, v3, Lbdf;->b:Ljava/lang/String;

    .line 6074
    aput-object v3, v2, v5

    .line 6075
    invoke-virtual {v0}, Laqj;->f()V

    goto :goto_0

    .line 201
    :cond_1
    invoke-virtual {p0, p2}, Lalm;->a(Ljava/lang/String;)V

    .line 202
    iput-object p2, p0, Lalm;->q:Ljava/lang/String;

    .line 203
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 10

    .prologue
    const-wide/16 v8, -0x1

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 227
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lalm;->q:Ljava/lang/String;

    aput-object v1, v0, v2

    aput-object p1, v0, v3

    .line 229
    iget-object v0, p0, Lalm;->q:Ljava/lang/String;

    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 230
    iput-object p1, p0, Lalm;->q:Ljava/lang/String;

    .line 231
    iget-object v1, p0, Lalm;->g:Ljava/util/List;

    monitor-enter v1

    .line 232
    :try_start_0
    iget-object v0, p0, Lalm;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 233
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 236
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laow;

    .line 244
    sget v3, Laoz;->b:I

    invoke-virtual {v0, v3}, Laow;->b(I)J

    move-result-wide v4

    cmp-long v3, v4, v8

    if-nez v3, :cond_0

    sget v3, Laoz;->c:I

    .line 245
    invoke-virtual {v0, v3}, Laow;->b(I)J

    move-result-wide v4

    cmp-long v3, v4, v8

    if-nez v3, :cond_0

    .line 246
    iget-object v3, p0, Lalm;->c:Lass;

    invoke-virtual {v3, v0}, Lass;->b(Laow;)V

    .line 247
    iget-object v3, p0, Lalm;->g:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v3

    .line 248
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    .line 249
    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    iget-object v6, p0, Lalm;->g:Ljava/util/List;

    .line 250
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v5

    .line 251
    iget-object v4, p0, Lalm;->d:Lbmu;

    if-eqz v4, :cond_1

    .line 252
    iget-object v4, p0, Lalm;->d:Lbmu;

    invoke-virtual {v4, v3}, Lbmu;->g(I)V

    .line 9474
    :cond_1
    iget-object v0, v0, Laow;->j:Ljava/lang/String;

    .line 256
    invoke-direct {p0, v0}, Lalm;->g(Ljava/lang/String;)V

    goto :goto_0

    .line 259
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_2
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 261
    :cond_3
    return-void
.end method

.method public final a(Ljava/util/List;)V
    .locals 3

    .prologue
    .line 524
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    .line 525
    iput-object p1, p0, Lalm;->r:Ljava/util/List;

    .line 526
    iget-object v0, p0, Lalm;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 528
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Last;

    .line 33067
    iget-object v2, v0, Last;->b:Ljava/lang/String;

    .line 530
    invoke-virtual {p0, v2}, Lalm;->b(Ljava/lang/String;)Laow;

    move-result-object v2

    if-nez v2, :cond_0

    .line 532
    iget-object v2, p0, Lalm;->m:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 535
    :cond_1
    iget-object v0, p0, Lalm;->d:Lbmu;

    if-eqz v0, :cond_2

    .line 537
    iget-object v0, p0, Lalm;->d:Lbmu;

    .line 33380
    iget-object v0, v0, Lyz;->a:Lza;

    invoke-virtual {v0}, Lza;->a()V

    .line 539
    :cond_2
    return-void
.end method

.method public final a(Ljava/util/Set;)V
    .locals 6

    .prologue
    .line 906
    iget-object v0, p0, Lalm;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laow;

    .line 907
    invoke-virtual {v0}, Laow;->r()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Laow;->n()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 908
    sget v2, Laoz;->a:I

    invoke-static {}, Lbkl;->b()J

    move-result-wide v4

    .line 41128
    iget-object v0, v0, Laow;->u:[J

    add-int/lit8 v2, v2, -0x1

    aput-wide v4, v0, v2

    goto :goto_0

    .line 911
    :cond_1
    return-void
.end method

.method public final a(Luh;)V
    .locals 12

    .prologue
    .line 475
    .line 11231
    iget-object v0, p1, Luh;->m:Landroid/os/Bundle;

    .line 475
    invoke-static {v0}, Lcom/google/android/gms/cast/CastDevice;->a(Landroid/os/Bundle;)Lcom/google/android/gms/cast/CastDevice;

    move-result-object v10

    .line 476
    invoke-static {v10}, Layy;->a(Lcom/google/android/gms/cast/CastDevice;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 483
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 12000
    iget-object v2, v10, Lcom/google/android/gms/cast/CastDevice;->e:Ljava/lang/String;

    .line 483
    aput-object v2, v0, v1

    const/4 v1, 0x1

    .line 13000
    iget-object v2, v10, Lcom/google/android/gms/cast/CastDevice;->f:Ljava/lang/String;

    .line 484
    aput-object v2, v0, v1

    .line 521
    :cond_0
    :goto_0
    return-void

    .line 13546
    :cond_1
    if-eqz v10, :cond_8

    .line 14000
    iget-object v0, v10, Lcom/google/android/gms/cast/CastDevice;->b:Ljava/lang/String;

    .line 13547
    iget-object v1, p0, Lalm;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "__opencast__"

    .line 15000
    iget-object v1, v10, Lcom/google/android/gms/cast/CastDevice;->b:Ljava/lang/String;

    .line 13548
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    :cond_2
    const/4 v0, 0x1

    .line 488
    :goto_1
    if-nez v0, :cond_0

    .line 494
    iget-object v1, p0, Lalm;->g:Ljava/util/List;

    monitor-enter v1

    .line 16000
    :try_start_0
    iget-object v0, v10, Lcom/google/android/gms/cast/CastDevice;->b:Ljava/lang/String;

    .line 17000
    iget-object v2, v10, Lcom/google/android/gms/cast/CastDevice;->d:Ljava/net/Inet4Address;

    .line 496
    invoke-virtual {v2}, Ljava/net/Inet4Address;->getHostAddress()Ljava/lang/String;

    move-result-object v2

    .line 495
    invoke-virtual {p0, v0, v2}, Lalm;->a(Ljava/lang/String;Ljava/lang/String;)Laow;

    move-result-object v0

    .line 497
    if-nez v0, :cond_9

    .line 498
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lalm;->a(Z)Laow;

    move-result-object v0

    move-object v9, v0

    .line 17262
    :goto_2
    iput-object v10, v9, Laow;->b:Lcom/google/android/gms/cast/CastDevice;

    .line 17772
    iget-boolean v0, v9, Laow;->d:Z

    .line 17265
    if-nez v0, :cond_3

    .line 17266
    iget-object v0, v9, Laow;->c:Lbdf;

    iget-object v2, v9, Laow;->b:Lcom/google/android/gms/cast/CastDevice;

    .line 18000
    iget-object v2, v2, Lcom/google/android/gms/cast/CastDevice;->e:Ljava/lang/String;

    .line 18247
    iput-object v2, v0, Lbdf;->b:Ljava/lang/String;

    .line 17268
    :cond_3
    iget-object v0, v9, Laow;->b:Lcom/google/android/gms/cast/CastDevice;

    .line 19000
    iget-object v0, v0, Lcom/google/android/gms/cast/CastDevice;->b:Ljava/lang/String;

    .line 17268
    invoke-virtual {v9, v0}, Laow;->a(Ljava/lang/String;)V

    .line 17269
    sget v0, Laoz;->d:I

    invoke-virtual {v9, v0}, Laow;->a(I)V

    .line 504
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19555
    invoke-virtual {v9}, Laow;->n()Ljava/lang/String;

    move-result-object v1

    .line 19556
    new-instance v0, Lbdu;

    const/4 v2, 0x0

    const/4 v3, 0x0

    sget v4, Lbew;->c:I

    const/4 v5, 0x0

    iget-object v6, p0, Lalm;->s:Ljava/util/concurrent/ExecutorService;

    invoke-direct/range {v0 .. v6}, Lbdu;-><init>(Ljava/lang/String;ILjava/lang/String;ILaph;Ljava/util/concurrent/ExecutorService;)V

    .line 19561
    iget-object v2, p0, Lalm;->k:Ljava/util/Set;

    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 20474
    iget-object v2, v9, Laow;->j:Ljava/lang/String;

    .line 19562
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 20575
    invoke-virtual {v9}, Laow;->n()Ljava/lang/String;

    move-result-object v2

    .line 21597
    iget-object v3, v9, Laow;->c:Lbdf;

    .line 22254
    iget-object v3, v3, Lbdf;->b:Ljava/lang/String;

    .line 20577
    new-instance v11, Lalo;

    invoke-direct {v11, p0, v3, v2, v9}, Lalo;-><init>(Lalm;Ljava/lang/String;Ljava/lang/String;Laow;)V

    .line 20601
    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v3, v4, v5

    .line 20602
    invoke-static {}, Laqi;->a()Laqi;

    .line 20604
    iget-object v3, p0, Lalm;->k:Ljava/util/Set;

    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 20605
    const-string v2, "E8C28D3C"

    .line 22483
    invoke-virtual {v0}, Lbdu;->d()J

    move-result-wide v4

    .line 22484
    new-instance v6, Lbdo;

    iget-object v3, v0, Lbdu;->d:Ljava/lang/String;

    invoke-direct {v6, v3, v2}, Lbdo;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 22485
    const-string v3, "getAppDeviceId"

    iget v7, v0, Lbdu;->e:I

    new-instance v8, Lbed;

    invoke-direct {v8, v0, v11, v6}, Lbed;-><init>(Lbdu;Lbdn;Lbdo;)V

    move-object v2, v0

    invoke-virtual/range {v2 .. v8}, Lbdu;->a(Ljava/lang/String;JLbfp;ILbff;)V

    .line 19565
    :cond_4
    iget-object v2, p0, Lalm;->j:Ljava/util/Set;

    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    .line 22772
    iget-boolean v2, v9, Laow;->d:Z

    .line 19565
    if-nez v2, :cond_5

    .line 23610
    invoke-virtual {v9}, Laow;->n()Ljava/lang/String;

    move-result-object v2

    .line 24597
    iget-object v3, v9, Laow;->c:Lbdf;

    .line 25254
    iget-object v3, v3, Lbdf;->b:Ljava/lang/String;

    .line 23612
    new-instance v4, Lalp;

    invoke-direct {v4, p0, v3, v2, v9}, Lalp;-><init>(Lalm;Ljava/lang/String;Ljava/lang/String;Laow;)V

    .line 23634
    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v3, v5, v6

    .line 23635
    iget-object v3, p0, Lalm;->j:Ljava/util/Set;

    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 23636
    const/16 v2, 0x4ae

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-virtual {v0, v2, v3, v5, v4}, Lbdu;->a(ILjava/util/Locale;ZLbdn;)V

    .line 19568
    :cond_5
    iget-object v2, p0, Lalm;->l:Ljava/util/Set;

    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    .line 25622
    iget-object v1, v9, Laow;->q:Ljava/lang/String;

    .line 19568
    if-nez v1, :cond_6

    .line 25646
    invoke-virtual {v9}, Laow;->n()Ljava/lang/String;

    move-result-object v1

    .line 26597
    iget-object v2, v9, Laow;->c:Lbdf;

    .line 27254
    iget-object v2, v2, Lbdf;->b:Ljava/lang/String;

    .line 25648
    new-instance v7, Lalq;

    invoke-direct {v7, p0, v2, v1, v9}, Lalq;-><init>(Lalm;Ljava/lang/String;Ljava/lang/String;Laow;)V

    .line 25668
    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    .line 25669
    iget-object v2, p0, Lalm;->l:Ljava/util/Set;

    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 27501
    invoke-virtual {v0}, Lbdu;->d()J

    move-result-wide v2

    .line 27502
    new-instance v4, Lbfg;

    iget-object v1, v0, Lbdu;->d:Ljava/lang/String;

    invoke-direct {v4, v1}, Lbfg;-><init>(Ljava/lang/String;)V

    .line 27503
    const-string v1, "getOffersToken"

    iget v5, v0, Lbdu;->e:I

    new-instance v6, Lbee;

    invoke-direct {v6, v0, v7, v4}, Lbee;-><init>(Lbdu;Lbdn;Lbfg;)V

    invoke-virtual/range {v0 .. v6}, Lbdu;->a(Ljava/lang/String;JLbfp;ILbff;)V

    .line 508
    :cond_6
    iget-object v0, p0, Lalm;->c:Lass;

    invoke-virtual {v0, v9}, Lass;->a(Laow;)Laqj;

    move-result-object v0

    if-nez v0, :cond_7

    .line 509
    iget-object v1, p0, Lalm;->c:Lass;

    .line 28469
    iget-object v0, v9, Laow;->b:Lcom/google/android/gms/cast/CastDevice;

    .line 28027
    if-nez v0, :cond_b

    .line 28028
    iget-object v0, v1, Lass;->b:Lblp;

    const-string v1, "Tried to create a connection for %s but castDevice was null"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    .line 29597
    iget-object v4, v9, Laow;->c:Lbdf;

    .line 30254
    iget-object v4, v4, Lbdf;->b:Ljava/lang/String;

    .line 28028
    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 513
    :cond_7
    :goto_3
    const/4 v0, 0x4

    invoke-virtual {v10, v0}, Lcom/google/android/gms/cast/CastDevice;->a(I)Z

    move-result v0

    if-eqz v0, :cond_d

    const/4 v0, 0x1

    .line 514
    invoke-virtual {v10, v0}, Lcom/google/android/gms/cast/CastDevice;->a(I)Z

    move-result v0

    if-nez v0, :cond_d

    .line 515
    iget-object v0, p0, Lalm;->b:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "hendrixDiscovered"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 516
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto/16 :goto_0

    .line 13548
    :cond_8
    const/4 v0, 0x0

    goto/16 :goto_1

    .line 499
    :cond_9
    :try_start_1
    invoke-virtual {v0}, Laow;->q()Z

    move-result v2

    if-eqz v2, :cond_a

    .line 501
    invoke-virtual {p0, v0}, Lalm;->b(Laow;)V

    :cond_a
    move-object v9, v0

    goto/16 :goto_2

    .line 504
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 28033
    :cond_b
    iget-object v2, v1, Lass;->a:Ljava/util/Map;

    monitor-enter v2

    .line 28034
    :try_start_2
    iget-object v0, v1, Lass;->a:Ljava/util/Map;

    .line 30432
    iget-object v3, v9, Laow;->a:Ljava/lang/String;

    .line 28034
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laqj;

    .line 28035
    if-nez v0, :cond_c

    .line 28036
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v3, 0x0

    .line 30597
    iget-object v4, v9, Laow;->c:Lbdf;

    .line 31254
    iget-object v4, v4, Lbdf;->b:Ljava/lang/String;

    .line 28036
    aput-object v4, v0, v3

    .line 28037
    new-instance v0, Laqj;

    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v3

    .line 28038
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v4

    invoke-static {v4}, Latf;->a(Landroid/content/Context;)Latf;

    move-result-object v4

    invoke-direct {v0, v9, v3, v4}, Laqj;-><init>(Laow;Landroid/content/Context;Latf;)V

    .line 28039
    iget-object v1, v1, Lass;->a:Ljava/util/Map;

    .line 31432
    iget-object v3, v9, Laow;->a:Ljava/lang/String;

    .line 28039
    invoke-interface {v1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28043
    :goto_4
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 28044
    invoke-virtual {v0}, Laqj;->f()V

    goto :goto_3

    .line 28041
    :cond_c
    const/4 v1, 0x1

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    .line 31597
    iget-object v4, v9, Laow;->c:Lbdf;

    .line 32254
    iget-object v4, v4, Lbdf;->b:Ljava/lang/String;

    .line 28041
    aput-object v4, v1, v3

    goto :goto_4

    .line 28043
    :catchall_1
    move-exception v0

    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0

    .line 517
    :cond_d
    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Lcom/google/android/gms/cast/CastDevice;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 518
    iget-object v0, p0, Lalm;->b:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "nonhendrixDiscovered"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 519
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto/16 :goto_0
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 276
    iget-object v0, p0, Lalm;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final a(I)Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 300
    iget-object v0, p0, Lalm;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    .line 308
    :goto_0
    return v0

    .line 303
    :cond_0
    iget-object v0, p0, Lalm;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laow;

    .line 304
    invoke-virtual {v0, p1}, Laow;->d(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 305
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    move v0, v1

    .line 308
    goto :goto_0
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 280
    iget-object v0, p0, Lalm;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final b(Ljava/lang/String;)Laow;
    .locals 3

    .prologue
    .line 346
    .line 10268
    iget-object v0, p0, Lalm;->g:Ljava/util/List;

    .line 346
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laow;

    .line 10474
    iget-object v2, v0, Laow;->j:Ljava/lang/String;

    .line 347
    invoke-static {v2, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 351
    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(Laow;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 796
    iget-object v0, p0, Lalm;->g:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    .line 797
    iget-object v1, p0, Lalm;->g:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 798
    new-array v1, v5, [Ljava/lang/Object;

    iget-object v2, p0, Lalm;->g:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v4

    .line 799
    invoke-virtual {p0}, Lalm;->e()I

    move-result v1

    .line 800
    invoke-virtual {p0, v1, p1}, Lalm;->a(ILaow;)V

    .line 801
    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v5

    .line 802
    iget-object v2, p0, Lalm;->d:Lbmu;

    if-eqz v2, :cond_0

    .line 803
    if-ne v0, v1, :cond_1

    .line 804
    iget-object v1, p0, Lalm;->d:Lbmu;

    invoke-virtual {v1, v0}, Lbmu;->e(I)V

    .line 809
    :cond_0
    :goto_0
    return-void

    .line 806
    :cond_1
    iget-object v2, p0, Lalm;->d:Lbmu;

    invoke-virtual {v2, v0, v1}, Lbmu;->a(II)V

    goto :goto_0
.end method

.method public final c(Ljava/lang/String;)Laow;
    .locals 3

    .prologue
    .line 708
    iget-object v0, p0, Lalm;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laow;

    .line 709
    invoke-virtual {v0}, Laow;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 718
    :goto_0
    return-object v0

    .line 713
    :cond_1
    iget-object v0, p0, Lalm;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laow;

    .line 714
    invoke-virtual {v0}, Laow;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    .line 718
    :cond_3
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final c()Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 316
    iget-object v0, p0, Lalm;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    .line 324
    :goto_0
    return v0

    .line 319
    :cond_0
    iget-object v0, p0, Lalm;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laow;

    .line 320
    invoke-virtual {v0}, Laow;->q()Z

    move-result v0

    if-nez v0, :cond_1

    move v0, v1

    .line 321
    goto :goto_0

    .line 324
    :cond_2
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final c(Laow;)Z
    .locals 6

    .prologue
    const/4 v2, 0x1

    const/4 v0, 0x0

    const/4 v5, -0x1

    .line 842
    .line 844
    iget-object v3, p0, Lalm;->g:Ljava/util/List;

    monitor-enter v3

    .line 845
    :try_start_0
    iget-object v1, p0, Lalm;->g:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v4

    .line 846
    if-ltz v4, :cond_4

    .line 847
    sget v1, Lalr;->a:I

    invoke-direct {p0, v4, v1}, Lalm;->a(II)Z

    move-result v1

    if-eqz v1, :cond_4

    move v1, v2

    .line 851
    :goto_0
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 853
    if-ne v4, v5, :cond_3

    .line 854
    iget-object v3, p0, Lalm;->h:Ljava/util/List;

    monitor-enter v3

    .line 855
    :try_start_1
    iget-object v4, p0, Lalm;->h:Ljava/util/List;

    invoke-interface {v4, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v4

    .line 856
    if-ne v4, v5, :cond_1

    .line 857
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 867
    :cond_0
    :goto_1
    return v0

    .line 851
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 859
    :cond_1
    :try_start_3
    sget v0, Lalr;->b:I

    invoke-direct {p0, v4, v0}, Lalm;->a(II)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v2

    .line 862
    :goto_2
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 864
    :goto_3
    if-eqz v0, :cond_0

    .line 865
    invoke-virtual {p0}, Lalm;->g()V

    goto :goto_1

    .line 862
    :catchall_1
    move-exception v0

    :try_start_4
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0

    :cond_2
    move v0, v1

    goto :goto_2

    :cond_3
    move v0, v1

    goto :goto_3

    :cond_4
    move v1, v0

    goto :goto_0
.end method

.method public d(Ljava/lang/String;)Laow;
    .locals 3

    .prologue
    .line 723
    iget-object v0, p0, Lalm;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laow;

    .line 34597
    iget-object v2, v0, Laow;->c:Lbdf;

    .line 35395
    iget-object v2, v2, Lbdf;->q:Ljava/lang/String;

    .line 724
    if-eqz v2, :cond_0

    .line 35597
    iget-object v2, v0, Laow;->c:Lbdf;

    .line 36395
    iget-object v2, v2, Lbdf;->q:Ljava/lang/String;

    .line 724
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 728
    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final d()Ljava/util/ArrayList;
    .locals 4

    .prologue
    .line 332
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 333
    iget-object v0, p0, Lalm;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laow;

    .line 334
    invoke-virtual {v0}, Laow;->q()Z

    move-result v3

    if-nez v3, :cond_0

    .line 335
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 338
    :cond_1
    return-object v1
.end method

.method public d(Laow;)V
    .locals 5

    .prologue
    .line 1029
    iget-object v1, p0, Lalm;->h:Ljava/util/List;

    monitor-enter v1

    .line 1030
    :try_start_0
    iget-object v0, p0, Lalm;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    .line 1031
    iget-object v2, p0, Lalm;->h:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1032
    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lalm;->h:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    .line 1033
    iget-object v2, p0, Lalm;->d:Lbmu;

    if-eqz v2, :cond_0

    .line 1034
    iget-object v2, p0, Lalm;->d:Lbmu;

    .line 45472
    if-eqz v0, :cond_1

    .line 45473
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v3, 0x0

    .line 45596
    invoke-virtual {v2}, Lbmu;->a()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    .line 45473
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v0, v3

    .line 46596
    invoke-virtual {v2}, Lbmu;->a()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 45474
    invoke-virtual {v2, v0}, Lbmu;->c(I)V

    .line 1036
    :cond_0
    :goto_0
    monitor-exit v1

    return-void

    .line 45476
    :cond_1
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v3, 0x0

    .line 47596
    invoke-virtual {v2}, Lbmu;->a()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    .line 45476
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v0, v3

    .line 48596
    invoke-virtual {v2}, Lbmu;->a()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 45477
    invoke-virtual {v2, v0}, Lbmu;->b(I)V

    goto :goto_0

    .line 1036
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method e()I
    .locals 2

    .prologue
    .line 782
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lalm;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 784
    iget-object v0, p0, Lalm;->g:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laow;

    invoke-virtual {v0}, Laow;->q()Z

    move-result v0

    if-nez v0, :cond_0

    .line 788
    :goto_1
    return v1

    .line 782
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 788
    :cond_1
    iget-object v0, p0, Lalm;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    goto :goto_1
.end method

.method public e(Ljava/lang/String;)Laow;
    .locals 4

    .prologue
    .line 732
    iget-object v0, p0, Lalm;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laow;

    .line 36432
    iget-object v2, v0, Laow;->a:Ljava/lang/String;

    .line 733
    if-eqz v2, :cond_0

    .line 37432
    iget-object v2, v0, Laow;->a:Ljava/lang/String;

    .line 734
    invoke-static {p1}, Laow;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 738
    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method f(Ljava/lang/String;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 1007
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 44531
    :cond_0
    :goto_0
    return-void

    .line 1010
    :cond_1
    iget-object v0, p0, Lalm;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 1011
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1012
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Last;

    .line 44067
    iget-object v0, v0, Last;->b:Ljava/lang/String;

    .line 1012
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1013
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 1014
    new-array v0, v5, [Ljava/lang/Object;

    iget-object v1, p0, Lalm;->m:Ljava/util/List;

    .line 1015
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v4

    .line 1016
    iget-object v0, p0, Lalm;->d:Lbmu;

    if-eqz v0, :cond_0

    .line 1017
    iget-object v0, p0, Lalm;->d:Lbmu;

    iget-object v1, p0, Lalm;->m:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    .line 44527
    new-array v2, v5, [Ljava/lang/Object;

    iget-object v3, v0, Lbmu;->d:Ljava/util/List;

    aput-object v3, v2, v4

    .line 44528
    if-eqz v1, :cond_3

    .line 44529
    new-array v1, v5, [Ljava/lang/Object;

    .line 44530
    invoke-virtual {v0}, Lbmu;->b()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v4

    .line 44531
    invoke-virtual {v0}, Lbmu;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Lbmu;->d(I)V

    goto :goto_0

    .line 44533
    :cond_3
    new-array v1, v5, [Ljava/lang/Object;

    .line 44534
    invoke-virtual {v0}, Lbmu;->b()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v4

    .line 44535
    invoke-virtual {v0}, Lbmu;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Lbmu;->b(I)V

    goto :goto_0
.end method

.method public final f()Z
    .locals 5

    .prologue
    const/4 v1, 0x1

    .line 817
    const/4 v2, 0x0

    .line 818
    iget-object v0, p0, Lalm;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v4, v0

    move v0, v2

    move v2, v4

    :goto_0
    if-ltz v2, :cond_1

    .line 819
    sget v3, Lalr;->a:I

    invoke-direct {p0, v2, v3}, Lalm;->a(II)Z

    move-result v3

    if-eqz v3, :cond_0

    move v0, v1

    .line 818
    :cond_0
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    .line 824
    :cond_1
    iget-object v2, p0, Lalm;->h:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    :goto_1
    if-ltz v2, :cond_3

    .line 825
    sget v3, Lalr;->b:I

    invoke-direct {p0, v2, v3}, Lalm;->a(II)Z

    move-result v3

    if-eqz v3, :cond_2

    move v0, v1

    .line 824
    :cond_2
    add-int/lit8 v2, v2, -0x1

    goto :goto_1

    .line 830
    :cond_3
    if-eqz v0, :cond_4

    .line 831
    invoke-virtual {p0}, Lalm;->g()V

    .line 833
    :cond_4
    return v0
.end method

.method g()V
    .locals 2

    .prologue
    .line 1062
    iget-object v0, p0, Lalm;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lazf;

    .line 1063
    invoke-interface {v0}, Lazf;->s()V

    goto :goto_0

    .line 1065
    :cond_0
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 1069
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1070
    iget-object v0, p0, Lalm;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laow;

    .line 1071
    invoke-virtual {v0}, Laow;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1073
    :cond_0
    const-string v0, ", "

    invoke-static {v0, v1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
