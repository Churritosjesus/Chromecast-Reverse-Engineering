.class public final Lblm;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field public final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 259
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 260
    iput-object p1, p0, Lblm;->a:Ljava/lang/String;

    .line 261
    iput-object p2, p0, Lblm;->b:Ljava/lang/String;

    .line 262
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 270
    iget-object v0, p0, Lblm;->b:Ljava/lang/String;

    return-object v0
.end method
