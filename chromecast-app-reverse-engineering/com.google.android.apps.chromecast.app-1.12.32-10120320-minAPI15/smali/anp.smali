.class final Lanp;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbaa;


# instance fields
.field private synthetic a:Lapd;

.field private synthetic b:Ljava/lang/String;

.field private synthetic c:J

.field private synthetic d:Land;


# direct methods
.method constructor <init>(Land;Lapd;Ljava/lang/String;J)V
    .locals 0

    .prologue
    .line 1158
    iput-object p1, p0, Lanp;->d:Land;

    iput-object p2, p0, Lanp;->a:Lapd;

    iput-object p3, p0, Lanp;->b:Ljava/lang/String;

    iput-wide p4, p0, Lanp;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    .prologue
    const/4 v2, 0x1

    .line 1162
    iget-object v0, p0, Lanp;->d:Land;

    iget-boolean v0, v0, Land;->u:Z

    if-eqz v0, :cond_0

    .line 1163
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    iget-object v1, p0, Lanp;->a:Lapd;

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lapd;->a(I)Lapd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lape;->a(Lapd;)V

    .line 1182
    :goto_0
    return-void

    .line 1166
    :cond_0
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    iget-object v1, p0, Lanp;->a:Lapd;

    invoke-virtual {v1, v2}, Lapd;->a(I)Lapd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lape;->a(Lapd;)V

    .line 1167
    iget-object v0, p0, Lanp;->d:Land;

    iget-object v1, p0, Lanp;->d:Land;

    invoke-static {v1}, Land;->n(Land;)Lbfs;

    move-result-object v1

    iput-object v1, v0, Land;->n:Lbfs;

    .line 1168
    iget-object v0, p0, Lanp;->d:Land;

    iget-object v1, p0, Lanp;->b:Ljava/lang/String;

    iput-object v1, v0, Land;->k:Ljava/lang/String;

    .line 1169
    new-array v0, v2, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 1170
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-wide v4, p0, Lanp;->c:J

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    .line 1172
    iget-object v0, p0, Lanp;->b:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 1174
    iget-object v0, p0, Lanp;->d:Land;

    invoke-static {v0}, Land;->o(Land;)Lbdu;

    move-result-object v0

    iget-object v1, p0, Lanp;->d:Land;

    invoke-static {v1}, Land;->n(Land;)Lbfs;

    move-result-object v1

    .line 2130
    iget-object v1, v1, Lbfs;->a:Ljava/lang/String;

    .line 2160
    iput-object v1, v0, Lbdu;->f:Ljava/lang/String;

    .line 1175
    iget-object v0, p0, Lanp;->d:Land;

    invoke-static {v0}, Land;->o(Land;)Lbdu;

    move-result-object v0

    iget-object v1, p0, Lanp;->b:Ljava/lang/String;

    .line 3152
    iput-object v1, v0, Lbdu;->d:Ljava/lang/String;

    .line 1176
    iget-object v0, p0, Lanp;->d:Land;

    invoke-static {v0}, Land;->p(Land;)V

    goto :goto_0

    .line 1180
    :cond_1
    iget-object v0, p0, Lanp;->d:Land;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Land;->b(Land;Lbdf;)V

    goto :goto_0
.end method

.method public final a(Z)V
    .locals 10

    .prologue
    const/4 v9, 0x1

    const/4 v8, 0x0

    .line 1186
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    iget-object v1, p0, Lanp;->a:Lapd;

    invoke-virtual {v1, v8}, Lapd;->a(I)Lapd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lape;->a(Lapd;)V

    .line 1187
    iget-object v0, p0, Lanp;->d:Land;

    sget v1, Lb;->eb:I

    new-array v2, v9, [Ljava/lang/Object;

    .line 1188
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    iget-wide v6, p0, Lanp;->c:J

    sub-long/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v2, v8

    .line 1187
    invoke-virtual {v0, v1, v2}, Land;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 1189
    iget-object v1, p0, Lanp;->d:Land;

    invoke-static {v1}, Land;->q(Land;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lanp;->d:Land;

    invoke-static {v1}, Land;->c(Land;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 1192
    iget-object v1, p0, Lanp;->d:Land;

    iget-object v2, p0, Lanp;->d:Land;

    sget v3, Lb;->dk:I

    new-array v4, v9, [Ljava/lang/Object;

    iget-object v5, p0, Lanp;->d:Land;

    .line 1193
    invoke-static {v5}, Land;->r(Land;)Lbfs;

    move-result-object v5

    .line 4130
    iget-object v5, v5, Lbfs;->a:Ljava/lang/String;

    .line 1193
    aput-object v5, v4, v8

    .line 1192
    invoke-virtual {v2, v3, v4}, Land;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Land;->b(Land;Ljava/lang/String;Ljava/lang/String;)V

    .line 1198
    :goto_0
    return-void

    .line 1195
    :cond_0
    iget-object v1, p0, Lanp;->d:Land;

    iget-object v2, p0, Lanp;->d:Land;

    sget v3, Lb;->em:I

    new-array v4, v9, [Ljava/lang/Object;

    iget-object v5, p0, Lanp;->d:Land;

    .line 1196
    invoke-static {v5}, Land;->r(Land;)Lbfs;

    move-result-object v5

    .line 5130
    iget-object v5, v5, Lbfs;->a:Ljava/lang/String;

    .line 1196
    aput-object v5, v4, v8

    .line 1195
    invoke-virtual {v2, v3, v4}, Land;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Land;->a(Land;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method
