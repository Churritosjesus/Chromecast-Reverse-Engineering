.class final Ladd;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lacz;


# instance fields
.field final a:Ljava/lang/CharSequence;

.field final b:J

.field final c:Ljava/lang/Long;

.field final d:Ljava/lang/String;

.field final e:J

.field final f:Lacx;

.field private final g:Ljava/lang/CharSequence;

.field private h:Z

.field private i:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Lacx;)V
    .locals 2

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    const/4 v0, 0x0

    iput-boolean v0, p0, Ladd;->h:Z

    .line 1231
    iget-object v0, p1, Lacx;->c:Ljava/lang/String;

    .line 43
    iput-object v0, p0, Ladd;->g:Ljava/lang/CharSequence;

    .line 1235
    iget-object v0, p1, Lacx;->d:Ljava/lang/String;

    .line 44
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ladd;->a:Ljava/lang/CharSequence;

    .line 1247
    iget-wide v0, p1, Lacx;->g:J

    .line 45
    iput-wide v0, p0, Ladd;->b:J

    .line 1251
    iget-object v0, p1, Lacx;->h:Ljava/lang/Long;

    .line 46
    iput-object v0, p0, Ladd;->c:Ljava/lang/Long;

    .line 1285
    iget-object v0, p1, Lacx;->l:Ljava/lang/String;

    .line 47
    iput-object v0, p0, Ladd;->d:Ljava/lang/String;

    .line 2255
    iget-wide v0, p1, Lacx;->i:J

    .line 48
    iput-wide v0, p0, Ladd;->e:J

    .line 49
    iput-object p1, p0, Ladd;->f:Lacx;

    .line 50
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 99
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 100
    iput-object p1, p0, Ladd;->i:Ljava/lang/CharSequence;

    .line 104
    :goto_0
    return-void

    .line 102
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ladd;->i:Ljava/lang/CharSequence;

    goto :goto_0
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 59
    const/4 v0, 0x0

    return v0
.end method

.method public final b()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Ladd;->a:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final c()J
    .locals 2

    .prologue
    .line 74
    iget-wide v0, p0, Ladd;->b:J

    return-wide v0
.end method

.method public final d()Ljava/lang/Long;
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Ladd;->c:Ljava/lang/Long;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Ladd;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final f()J
    .locals 2

    .prologue
    .line 89
    iget-wide v0, p0, Ladd;->e:J

    return-wide v0
.end method

.method public final g()Lacx;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Ladd;->f:Lacx;

    return-object v0
.end method

.method public final h()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 108
    iget-object v0, p0, Ladd;->i:Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ladd;->i:Ljava/lang/CharSequence;

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Ladd;->f:Lacx;

    .line 3235
    iget-object v0, v0, Lacx;->d:Ljava/lang/String;

    goto :goto_0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .prologue
    .line 113
    iget-object v0, p0, Ladd;->g:Ljava/lang/CharSequence;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ladd;->a:Ljava/lang/CharSequence;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x3

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " <"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ">"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
