.class public final Ldht;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field public final a:Ljava/net/Socket;

.field public final b:Ldfx;

.field public final c:Ldfn;


# direct methods
.method public constructor <init>(Ldgf;Ljava/net/Socket;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 264
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 266
    iput-object p2, p0, Ldht;->a:Ljava/net/Socket;

    .line 267
    iput-object v0, p0, Ldht;->b:Ldfx;

    .line 268
    iput-object v0, p0, Ldht;->c:Ldfn;

    .line 269
    return-void
.end method

.method public constructor <init>(Ldgf;Ljavax/net/ssl/SSLSocket;Ldfx;Ldfn;)V
    .locals 0

    .prologue
    .line 273
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 275
    iput-object p2, p0, Ldht;->a:Ljava/net/Socket;

    .line 276
    iput-object p3, p0, Ldht;->b:Ldfx;

    .line 277
    iput-object p4, p0, Ldht;->c:Ldfn;

    .line 278
    return-void
.end method
