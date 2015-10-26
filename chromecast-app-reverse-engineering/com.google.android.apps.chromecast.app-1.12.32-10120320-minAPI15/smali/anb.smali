.class public final Lanb;
.super Lac;
.source "PG"


# instance fields
.field private synthetic b:Lcom/google/android/apps/chromecast/app/MainActivity;


# direct methods
.method public constructor <init>(Lcom/google/android/apps/chromecast/app/MainActivity;)V
    .locals 1

    .prologue
    .line 113
    iput-object p1, p0, Lanb;->b:Lcom/google/android/apps/chromecast/app/MainActivity;

    .line 1808
    iget-object v0, p1, Lm;->b:Lt;

    .line 114
    invoke-direct {p0, v0}, Lac;-><init>(Lr;)V

    .line 115
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 142
    iget-object v0, p0, Lanb;->b:Lcom/google/android/apps/chromecast/app/MainActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/MainActivity;->a(Lcom/google/android/apps/chromecast/app/MainActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final a(I)Lj;
    .locals 5

    .prologue
    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 119
    iget-object v0, p0, Lanb;->b:Lcom/google/android/apps/chromecast/app/MainActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/MainActivity;->a(Lcom/google/android/apps/chromecast/app/MainActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lana;->b:Lana;

    if-ne v0, v1, :cond_0

    .line 120
    iget-object v0, p0, Lanb;->b:Lcom/google/android/apps/chromecast/app/MainActivity;

    new-instance v1, Lama;

    invoke-direct {v1}, Lama;-><init>()V

    invoke-static {v0, v1}, Lcom/google/android/apps/chromecast/app/MainActivity;->a(Lcom/google/android/apps/chromecast/app/MainActivity;Lama;)Lama;

    .line 121
    iget-object v0, p0, Lanb;->b:Lcom/google/android/apps/chromecast/app/MainActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/MainActivity;->b(Lcom/google/android/apps/chromecast/app/MainActivity;)Lama;

    move-result-object v0

    .line 132
    :goto_0
    return-object v0

    .line 124
    :cond_0
    :try_start_0
    iget-object v0, p0, Lanb;->b:Lcom/google/android/apps/chromecast/app/MainActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/MainActivity;->a(Lcom/google/android/apps/chromecast/app/MainActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lana;

    iget-object v0, v0, Lana;->e:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 125
    :catch_0
    move-exception v0

    .line 126
    iget-object v1, p0, Lanb;->b:Lcom/google/android/apps/chromecast/app/MainActivity;

    invoke-static {v1}, Lcom/google/android/apps/chromecast/app/MainActivity;->c(Lcom/google/android/apps/chromecast/app/MainActivity;)Lblp;

    move-result-object v1

    const-string v2, "InstantiationException: %s"

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/InstantiationException;->getMessage()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-virtual {v1, v2, v3}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    :goto_1
    new-instance v0, Lama;

    invoke-direct {v0}, Lama;-><init>()V

    goto :goto_0

    .line 127
    :catch_1
    move-exception v0

    .line 128
    iget-object v1, p0, Lanb;->b:Lcom/google/android/apps/chromecast/app/MainActivity;

    invoke-static {v1}, Lcom/google/android/apps/chromecast/app/MainActivity;->c(Lcom/google/android/apps/chromecast/app/MainActivity;)Lblp;

    move-result-object v1

    const-string v2, "IllegalAccessException: %s"

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/IllegalAccessException;->getMessage()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-virtual {v1, v2, v3}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1
.end method

.method public final synthetic b(I)Ljava/lang/CharSequence;
    .locals 2

    .prologue
    .line 112
    .line 2137
    iget-object v1, p0, Lanb;->b:Lcom/google/android/apps/chromecast/app/MainActivity;

    iget-object v0, p0, Lanb;->b:Lcom/google/android/apps/chromecast/app/MainActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/MainActivity;->a(Lcom/google/android/apps/chromecast/app/MainActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lana;

    iget v0, v0, Lana;->d:I

    invoke-virtual {v1, v0}, Lcom/google/android/apps/chromecast/app/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 112
    return-object v0
.end method
