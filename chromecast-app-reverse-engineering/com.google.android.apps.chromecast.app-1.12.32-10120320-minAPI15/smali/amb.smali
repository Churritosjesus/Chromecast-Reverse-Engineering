.class final Lamb;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbob;


# instance fields
.field final synthetic a:Lama;


# direct methods
.method constructor <init>(Lama;)V
    .locals 0

    .prologue
    .line 192
    iput-object p1, p0, Lamb;->a:Lama;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 246
    iget-object v0, p0, Lamb;->a:Lama;

    invoke-static {v0}, Lama;->e(Lama;)Landroid/support/v7/widget/RecyclerView;

    move-result-object v0

    iget-object v1, p0, Lamb;->a:Lama;

    invoke-static {v1}, Lama;->d(Lama;)Lbmu;

    move-result-object v1

    invoke-virtual {v1}, Lbmu;->a()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->a(I)V

    .line 247
    return-void
.end method

.method public final a(Laow;)V
    .locals 5

    .prologue
    .line 200
    invoke-virtual {p1}, Laow;->q()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 201
    iget-object v0, p0, Lamb;->a:Lama;

    invoke-static {v0}, Lama;->a(Lama;)Lalm;

    move-result-object v0

    .line 1919
    iget-object v1, v0, Lalm;->i:Ljava/util/HashSet;

    .line 2597
    iget-object v2, p1, Laow;->c:Lbdf;

    .line 3395
    iget-object v2, v2, Lbdf;->q:Ljava/lang/String;

    .line 1919
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1921
    iget-object v1, v0, Lalm;->b:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "hiddenDevices"

    const-string v3, ","

    iget-object v4, v0, Lalm;->i:Ljava/util/HashSet;

    .line 1922
    invoke-virtual {v4}, Ljava/util/HashSet;->toArray()[Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 1923
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 1927
    invoke-virtual {v0, p1}, Lalm;->d(Laow;)V

    .line 1930
    iget-object v1, v0, Lalm;->g:Ljava/util/List;

    monitor-enter v1

    .line 1931
    :try_start_0
    iget-object v2, v0, Lalm;->g:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v2

    .line 1932
    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    .line 1933
    iget-object v3, v0, Lalm;->g:Ljava/util/List;

    invoke-virtual {v0, v2, v3}, Lalm;->a(ILjava/util/List;)V

    .line 1934
    iget-object v3, v0, Lalm;->d:Lbmu;

    if-eqz v3, :cond_0

    .line 1935
    iget-object v3, v0, Lalm;->d:Lbmu;

    invoke-virtual {v3, v2}, Lbmu;->g(I)V

    .line 1938
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1940
    invoke-virtual {v0}, Lalm;->g()V

    .line 206
    :goto_0
    return-void

    .line 1938
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 204
    :cond_1
    iget-object v0, p0, Lamb;->a:Lama;

    invoke-static {v0}, Lama;->b(Lama;)Lblp;

    move-result-object v0

    const-string v1, "Tried to hide %s, but it\'s already set up."

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    .line 3597
    iget-object v4, p1, Laow;->c:Lbdf;

    .line 4254
    iget-object v4, v4, Lbdf;->b:Ljava/lang/String;

    .line 204
    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public final a(Laow;I)V
    .locals 1

    .prologue
    .line 195
    iget-object v0, p0, Lamb;->a:Lama;

    invoke-static {v0, p1, p2}, Lama;->a(Lama;Laow;I)V

    .line 196
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 210
    iget-object v0, p0, Lamb;->a:Lama;

    invoke-static {v0}, Lama;->c(Lama;)Lash;

    move-result-object v0

    new-instance v1, Lamc;

    invoke-direct {v1, p0}, Lamc;-><init>(Lamb;)V

    .line 4317
    new-instance v2, Ldbt;

    invoke-direct {v2}, Ldbt;-><init>()V

    .line 4318
    iput-object p1, v2, Ldbt;->a:Ljava/lang/String;

    .line 4319
    const/4 v3, 0x2

    invoke-virtual {v0, v3, v2, v1}, Lash;->a(ILdbt;Lasp;)V

    .line 235
    return-void
.end method

.method public final b(Laow;)V
    .locals 3

    .prologue
    .line 239
    .line 240
    invoke-virtual {p1}, Laow;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lbmn;->a(Ljava/lang/String;)Lbmn;

    move-result-object v0

    .line 241
    iget-object v1, p0, Lamb;->a:Lama;

    .line 4669
    iget-object v1, v1, Lj;->x:Lt;

    .line 241
    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lbmn;->a(Lr;Ljava/lang/String;)V

    .line 242
    return-void
.end method
