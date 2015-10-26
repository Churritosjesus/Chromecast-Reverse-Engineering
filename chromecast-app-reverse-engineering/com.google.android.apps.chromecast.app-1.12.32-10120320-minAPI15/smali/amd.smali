.class final Lamd;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Laow;

.field private synthetic b:Lama;


# direct methods
.method constructor <init>(Lama;Laow;)V
    .locals 0

    .prologue
    .line 404
    iput-object p1, p0, Lamd;->b:Lama;

    iput-object p2, p0, Lamd;->a:Laow;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .prologue
    .line 407
    iget-object v0, p0, Lamd;->b:Lama;

    invoke-static {v0}, Lama;->a(Lama;)Lalm;

    move-result-object v0

    iget-object v1, p0, Lamd;->a:Laow;

    .line 2597
    iget-object v2, v1, Laow;->c:Lbdf;

    .line 3395
    iget-object v2, v2, Lbdf;->q:Ljava/lang/String;

    .line 1948
    iget-object v3, v0, Lalm;->i:Ljava/util/HashSet;

    invoke-virtual {v3, v2}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1949
    iget-object v2, v0, Lalm;->b:Landroid/content/SharedPreferences;

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v3, "hiddenDevices"

    const-string v4, ","

    iget-object v5, v0, Lalm;->i:Ljava/util/HashSet;

    .line 1950
    invoke-virtual {v5}, Ljava/util/HashSet;->toArray()[Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4, v5}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 1949
    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    .line 1951
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 1953
    :cond_0
    iget-object v2, v0, Lalm;->h:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1954
    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, v0, Lalm;->h:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    .line 1955
    invoke-virtual {v0}, Lalm;->e()I

    move-result v2

    .line 1956
    invoke-virtual {v0, v2, v1}, Lalm;->a(ILaow;)V

    .line 1957
    iget-object v1, v0, Lalm;->d:Lbmu;

    if-eqz v1, :cond_1

    .line 1958
    iget-object v1, v0, Lalm;->d:Lbmu;

    invoke-virtual {v1, v2}, Lbmu;->f(I)V

    .line 1959
    iget-object v1, v0, Lalm;->d:Lbmu;

    iget-object v2, v0, Lalm;->h:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    invoke-virtual {v1, v2}, Lbmu;->a(Z)V

    .line 1962
    :cond_1
    invoke-virtual {v0}, Lalm;->g()V

    .line 408
    :cond_2
    return-void
.end method
