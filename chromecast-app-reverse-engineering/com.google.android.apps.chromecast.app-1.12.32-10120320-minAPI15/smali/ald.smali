.class final Lald;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 280
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 280
    .line 2284
    new-instance v0, Lalb;

    invoke-direct {v0, p1}, Lalb;-><init>(Landroid/os/Parcel;)V

    .line 280
    return-object v0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 280
    .line 1289
    new-array v0, p1, [Lalb;

    .line 280
    return-object v0
.end method
