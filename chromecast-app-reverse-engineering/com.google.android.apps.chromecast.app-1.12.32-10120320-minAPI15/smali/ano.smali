.class final Lano;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbdn;


# instance fields
.field private synthetic a:Lann;


# direct methods
.method constructor <init>(Lann;)V
    .locals 0

    .prologue
    .line 1016
    iput-object p1, p0, Lano;->a:Lann;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 6

    .prologue
    .line 1016
    check-cast p1, Lbdf;

    .line 2020
    iget-object v0, p0, Lano;->a:Lann;

    iget-object v0, v0, Lann;->c:Land;

    iget-boolean v0, v0, Land;->u:Z

    if-eqz v0, :cond_0

    .line 2021
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    iget-object v1, p0, Lano;->a:Lann;

    iget-object v1, v1, Lann;->a:Lapd;

    const/4 v2, 0x2

    .line 2022
    invoke-virtual {v1, v2}, Lapd;->a(I)Lapd;

    move-result-object v1

    .line 2021
    invoke-virtual {v0, v1}, Lape;->a(Lapd;)V

    .line 2023
    :goto_0
    return-void

    .line 2026
    :cond_0
    iget-object v0, p0, Lano;->a:Lann;

    iget-object v0, v0, Lann;->c:Land;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-object v1, p0, Lano;->a:Lann;

    iget-object v1, v1, Lann;->c:Land;

    invoke-static {v1}, Land;->h(Land;)I

    move-result v1

    int-to-long v4, v1

    add-long/2addr v2, v4

    invoke-static {v0, v2, v3}, Land;->a(Land;J)J

    .line 2027
    iget-object v0, p0, Lano;->a:Lann;

    iget-object v0, v0, Lann;->c:Land;

    iget-object v1, p0, Lano;->a:Lann;

    iget-wide v2, v1, Lann;->b:J

    iget-object v1, p0, Lano;->a:Lann;

    iget-object v1, v1, Lann;->a:Lapd;

    invoke-static {v0, p1, v2, v3, v1}, Land;->a(Land;Lbdf;JLapd;)V

    goto :goto_0
.end method

.method public final b_(I)V
    .locals 7

    .prologue
    const/4 v4, 0x1

    const/4 v6, 0x0

    .line 1032
    const/16 v0, -0x63

    if-ne p1, v0, :cond_0

    .line 1033
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    iget-object v1, p0, Lano;->a:Lann;

    iget-object v1, v1, Lann;->a:Lapd;

    const/4 v2, 0x2

    .line 1034
    invoke-virtual {v1, v2}, Lapd;->a(I)Lapd;

    move-result-object v1

    .line 1033
    invoke-virtual {v0, v1}, Lape;->a(Lapd;)V

    .line 1035
    iget-object v0, p0, Lano;->a:Lann;

    iget-object v0, v0, Lann;->c:Land;

    invoke-virtual {v0}, Land;->w()V

    .line 1065
    :goto_0
    return-void

    .line 1038
    :cond_0
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    iget-object v1, p0, Lano;->a:Lann;

    iget-object v1, v1, Lann;->a:Lapd;

    .line 1039
    invoke-virtual {v1, v6}, Lapd;->a(I)Lapd;

    move-result-object v1

    .line 1038
    invoke-virtual {v0, v1}, Lape;->a(Lapd;)V

    .line 1040
    const/4 v0, -0x8

    if-ne p1, v0, :cond_1

    .line 1047
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    const-string v1, "Lost hotspot connection during setup (%d)"

    new-array v2, v4, [Ljava/lang/Object;

    .line 1049
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v6

    .line 1048
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 1047
    invoke-virtual {v0, v1}, Lcom/google/android/apps/chromecast/app/SetupApplication;->c(Ljava/lang/String;)V

    .line 1052
    iget-object v0, p0, Lano;->a:Lann;

    iget-object v0, v0, Lann;->c:Land;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Land;->a(Land;Ljava/lang/String;)V

    goto :goto_0

    .line 1055
    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    .line 1056
    invoke-static {p1}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a(I)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lano;->a:Lann;

    iget-wide v2, v2, Lann;->b:J

    cmp-long v2, v0, v2

    if-gez v2, :cond_2

    iget-object v2, p0, Lano;->a:Lann;

    iget-object v2, v2, Lann;->c:Land;

    .line 1058
    invoke-static {v2}, Land;->i(Land;)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-ltz v0, :cond_3

    .line 1059
    :cond_2
    iget-object v0, p0, Lano;->a:Lann;

    iget-object v0, v0, Lann;->c:Land;

    iget-object v1, p0, Lano;->a:Lann;

    iget-object v1, v1, Lann;->c:Land;

    sget v2, Lb;->aB:I

    invoke-virtual {v1, v2}, Land;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lano;->a:Lann;

    iget-object v2, v2, Lann;->c:Land;

    sget v3, Lb;->aW:I

    new-array v4, v4, [Ljava/lang/Object;

    .line 1060
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-virtual {v2, v3, v4}, Land;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 1059
    invoke-static {v0, v1, v2}, Land;->a(Land;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 1062
    :cond_3
    new-array v0, v4, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v6

    .line 1063
    iget-object v0, p0, Lano;->a:Lann;

    iget-object v0, v0, Lann;->c:Land;

    invoke-static {v0}, Land;->l(Land;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lano;->a:Lann;

    iget-object v1, v1, Lann;->c:Land;

    invoke-static {v1}, Land;->j(Land;)Ljava/lang/Runnable;

    move-result-object v1

    iget-object v2, p0, Lano;->a:Lann;

    iget-object v2, v2, Lann;->c:Land;

    invoke-static {v2}, Land;->k(Land;)I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto/16 :goto_0
.end method
