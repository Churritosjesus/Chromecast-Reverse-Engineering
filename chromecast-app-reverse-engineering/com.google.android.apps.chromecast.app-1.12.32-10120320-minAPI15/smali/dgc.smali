.class public final Ldgc;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field public final a:Ldfy;

.field public final b:Ldfx;

.field public final c:I

.field public final d:Ljava/lang/String;

.field public final e:Ldfn;

.field public final f:Ldfo;

.field public final g:Ldge;

.field public h:Ldgc;

.field public i:Ldgc;

.field final j:Ldgc;

.field private volatile k:Ldfb;


# direct methods
.method constructor <init>(Ldgd;)V
    .locals 1

    .prologue
    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1221
    iget-object v0, p1, Ldgd;->a:Ldfy;

    .line 51
    iput-object v0, p0, Ldgc;->a:Ldfy;

    .line 2221
    iget-object v0, p1, Ldgd;->b:Ldfx;

    .line 52
    iput-object v0, p0, Ldgc;->b:Ldfx;

    .line 3221
    iget v0, p1, Ldgd;->c:I

    .line 53
    iput v0, p0, Ldgc;->c:I

    .line 4221
    iget-object v0, p1, Ldgd;->d:Ljava/lang/String;

    .line 54
    iput-object v0, p0, Ldgc;->d:Ljava/lang/String;

    .line 5221
    iget-object v0, p1, Ldgd;->e:Ldfn;

    .line 55
    iput-object v0, p0, Ldgc;->e:Ldfn;

    .line 6221
    iget-object v0, p1, Ldgd;->f:Ldfp;

    .line 56
    invoke-virtual {v0}, Ldfp;->a()Ldfo;

    move-result-object v0

    iput-object v0, p0, Ldgc;->f:Ldfo;

    .line 7221
    iget-object v0, p1, Ldgd;->g:Ldge;

    .line 57
    iput-object v0, p0, Ldgc;->g:Ldge;

    .line 8221
    iget-object v0, p1, Ldgd;->h:Ldgc;

    .line 58
    iput-object v0, p0, Ldgc;->h:Ldgc;

    .line 9221
    iget-object v0, p1, Ldgd;->i:Ldgc;

    .line 59
    iput-object v0, p0, Ldgc;->i:Ldgc;

    .line 10221
    iget-object v0, p1, Ldgd;->j:Ldgc;

    .line 60
    iput-object v0, p0, Ldgc;->j:Ldgc;

    .line 61
    return-void
.end method


# virtual methods
.method public final a()Ldgd;
    .locals 1

    .prologue
    .line 134
    new-instance v0, Ldgd;

    .line 11221
    invoke-direct {v0, p0}, Ldgd;-><init>(Ldgc;)V

    .line 134
    return-object v0
.end method

.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 117
    .line 11121
    iget-object v0, p0, Ldgc;->f:Ldfo;

    invoke-virtual {v0, p1}, Ldfo;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 11122
    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    .line 117
    goto :goto_0
.end method

.method public final b()Ljava/util/List;
    .locals 2

    .prologue
    .line 190
    iget v0, p0, Ldgc;->c:I

    const/16 v1, 0x191

    if-ne v0, v1, :cond_0

    .line 191
    const-string v0, "WWW-Authenticate"

    .line 12126
    :goto_0
    iget-object v1, p0, Ldgc;->f:Ldfo;

    .line 197
    invoke-static {v1, v0}, Ldhl;->b(Ldfo;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    :goto_1
    return-object v0

    .line 192
    :cond_0
    iget v0, p0, Ldgc;->c:I

    const/16 v1, 0x197

    if-ne v0, v1, :cond_1

    .line 193
    const-string v0, "Proxy-Authenticate"

    goto :goto_0

    .line 195
    :cond_1
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    goto :goto_1
.end method

.method public final c()Ldfb;
    .locals 1

    .prologue
    .line 205
    iget-object v0, p0, Ldgc;->k:Ldfb;

    .line 206
    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Ldgc;->f:Ldfo;

    invoke-static {v0}, Ldfb;->a(Ldfo;)Ldfb;

    move-result-object v0

    iput-object v0, p0, Ldgc;->k:Ldfb;

    goto :goto_0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 210
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Response{protocol="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ldgc;->b:Ldfx;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", code="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Ldgc;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldgc;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldgc;->a:Ldfy;

    .line 13066
    iget-object v1, v1, Ldfy;->a:Ldfq;

    invoke-virtual {v1}, Ldfq;->toString()Ljava/lang/String;

    move-result-object v1

    .line 217
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
