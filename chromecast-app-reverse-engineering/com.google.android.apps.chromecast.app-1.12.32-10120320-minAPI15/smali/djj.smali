.class public final Ldjj;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field a:Ljava/lang/String;

.field b:Ljava/net/Socket;

.field c:Ldiq;

.field public d:Ldfx;

.field e:Ldiv;

.field f:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLjava/net/Socket;)V
    .locals 1

    .prologue
    .line 534
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 521
    sget-object v0, Ldiq;->a:Ldiq;

    iput-object v0, p0, Ldjj;->c:Ldiq;

    .line 522
    sget-object v0, Ldfx;->c:Ldfx;

    iput-object v0, p0, Ldjj;->d:Ldfx;

    .line 523
    sget-object v0, Ldiv;->a:Ldiv;

    iput-object v0, p0, Ldjj;->e:Ldiv;

    .line 535
    iput-object p1, p0, Ldjj;->a:Ljava/lang/String;

    .line 536
    const/4 v0, 0x1

    iput-boolean v0, p0, Ldjj;->f:Z

    .line 537
    iput-object p3, p0, Ldjj;->b:Ljava/net/Socket;

    .line 538
    return-void
.end method
