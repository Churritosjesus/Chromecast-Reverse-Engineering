.class public final Lapg;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field a:I

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/Integer;

.field e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field private g:Ljava/lang/Integer;

.field private h:Ljava/lang/Integer;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    return-void
.end method

.method public static a(I)Lapg;
    .locals 1

    .prologue
    .line 62
    new-instance v0, Lapg;

    invoke-direct {v0}, Lapg;-><init>()V

    .line 63
    iput p0, v0, Lapg;->a:I

    .line 64
    return-object v0
.end method


# virtual methods
.method public final a()Lapd;
    .locals 3

    .prologue
    .line 23
    new-instance v0, Lapd;

    iget v1, p0, Lapg;->a:I

    invoke-direct {v0, v1}, Lapd;-><init>(I)V

    .line 24
    iget-object v1, p0, Lapg;->f:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 25
    iget-object v1, p0, Lapg;->f:Ljava/lang/String;

    .line 1101
    iput-object v1, v0, Lapd;->f:Ljava/lang/String;

    .line 27
    :cond_0
    new-instance v1, Lddc;

    invoke-direct {v1}, Lddc;-><init>()V

    .line 28
    iget-object v2, p0, Lapg;->c:Ljava/lang/String;

    if-eqz v2, :cond_1

    .line 29
    iget-object v2, p0, Lapg;->c:Ljava/lang/String;

    iput-object v2, v1, Lddc;->b:Ljava/lang/String;

    .line 31
    :cond_1
    iget-object v2, p0, Lapg;->b:Ljava/lang/String;

    if-eqz v2, :cond_2

    .line 32
    iget-object v2, p0, Lapg;->b:Ljava/lang/String;

    iput-object v2, v1, Lddc;->a:Ljava/lang/String;

    .line 34
    :cond_2
    iget-object v2, p0, Lapg;->d:Ljava/lang/Integer;

    if-eqz v2, :cond_3

    .line 35
    iget-object v2, p0, Lapg;->d:Ljava/lang/Integer;

    iput-object v2, v1, Lddc;->c:Ljava/lang/Integer;

    .line 37
    :cond_3
    iget-object v2, p0, Lapg;->g:Ljava/lang/Integer;

    if-eqz v2, :cond_4

    .line 38
    iget-object v2, p0, Lapg;->g:Ljava/lang/Integer;

    iput-object v2, v1, Lddc;->d:Ljava/lang/Integer;

    .line 40
    :cond_4
    iget-object v2, p0, Lapg;->h:Ljava/lang/Integer;

    if-eqz v2, :cond_5

    .line 41
    iget-object v2, p0, Lapg;->h:Ljava/lang/Integer;

    iput-object v2, v1, Lddc;->f:Ljava/lang/Integer;

    .line 43
    :cond_5
    iget-object v2, p0, Lapg;->e:Ljava/lang/String;

    if-eqz v2, :cond_6

    .line 44
    iget-object v2, p0, Lapg;->e:Ljava/lang/String;

    iput-object v2, v1, Lddc;->e:Ljava/lang/String;

    .line 1110
    :cond_6
    iput-object v1, v0, Lapd;->g:Lddc;

    .line 47
    return-object v0
.end method

.method public final b(I)Lapg;
    .locals 1

    .prologue
    .line 94
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lapg;->g:Ljava/lang/Integer;

    .line 95
    return-object p0
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 54
    invoke-virtual {p0}, Lapg;->a()Lapd;

    move-result-object v0

    .line 55
    invoke-static {}, Lape;->a()Lape;

    move-result-object v1

    invoke-virtual {v1, v0}, Lape;->a(Lapd;)V

    .line 56
    return-void
.end method

.method public final c(I)Lapg;
    .locals 1

    .prologue
    .line 104
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lapg;->h:Ljava/lang/Integer;

    .line 105
    return-object p0
.end method
