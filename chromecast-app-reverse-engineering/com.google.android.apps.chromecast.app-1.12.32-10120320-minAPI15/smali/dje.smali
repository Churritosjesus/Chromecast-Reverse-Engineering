.class final Ldje;
.super Ldgj;
.source "PG"


# instance fields
.field private synthetic a:Z

.field private synthetic b:I

.field private synthetic c:I

.field private synthetic d:Ldh;

.field private synthetic e:Ldjb;


# direct methods
.method varargs constructor <init>(Ldjb;Ljava/lang/String;[Ljava/lang/Object;ZIILdh;)V
    .locals 0

    .prologue
    .line 393
    iput-object p1, p0, Ldje;->e:Ldjb;

    iput-boolean p4, p0, Ldje;->a:Z

    iput p5, p0, Ldje;->b:I

    iput p6, p0, Ldje;->c:I

    iput-object p7, p0, Ldje;->d:Ldh;

    invoke-direct {p0, p2, p3}, Ldgj;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .prologue
    .line 396
    :try_start_0
    iget-object v0, p0, Ldje;->e:Ldjb;

    iget-boolean v1, p0, Ldje;->a:Z

    iget v2, p0, Ldje;->b:I

    iget v3, p0, Ldje;->c:I

    iget-object v4, p0, Ldje;->d:Ldh;

    invoke-static {v0, v1, v2, v3, v4}, Ldjb;->a(Ldjb;ZIILdh;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 399
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
