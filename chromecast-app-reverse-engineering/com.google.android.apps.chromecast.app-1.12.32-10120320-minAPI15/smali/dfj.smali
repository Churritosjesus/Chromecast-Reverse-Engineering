.class final Ldfj;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Ldfi;


# direct methods
.method constructor <init>(Ldfi;)V
    .locals 0

    .prologue
    .line 95
    iput-object p1, p0, Ldfj;->a:Ldfi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 97
    iget-object v0, p0, Ldfj;->a:Ldfi;

    invoke-static {v0}, Ldfi;->a(Ldfi;)V

    .line 98
    return-void
.end method
